import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {ApiTierService} from '../services/api-tier-service/api-tier.service';
import {ScooterTier} from '../entities/scooter-tier';
import {TierService} from '../services/tier-service/tier.service';
import {Livetracker} from '../entities/livetracker';
import {interval} from 'rxjs';
import { ChartDataSets } from 'chart.js';
import { Color, Label } from 'ng2-charts';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {
  tierScooter: ScooterTier[];
  tierScooterStatistic: Livetracker[];
  counter: number;
  isFinished: boolean;
  
  timeinterval =  interval(240000);
  proxyurl = 'https://cors-anywhere.herokuapp.com/';
  urlApi = 'https://platform.tier-services.io/vehicle?zoneId=VIENNA';

  scooterActiveData = [];
  scooterActiveDateData = [];
  yearAndDay: string;
  time: string;
  hour: number;
  minutes: string;
  diagramLabel: string;

  lineChartData: ChartDataSets[] = [
    { data: this.scooterActiveData, label: 'Active Scooters 2020-02-21' },
  ];

  lineChartLabels: Label[] = this.scooterActiveDateData;

  lineChartOptions = {
    responsive: true,
  };

  lineChartColors: Color[] = [
    {
      borderColor: 'rgba(213,80,143,1)',
      backgroundColor: 'rgba(213,80,143,0.3)',
    },
  ];

  lineChartLegend = true;
  lineChartPlugins = [];
  lineChartType = 'line';

  constructor(private http: HttpClient, private apiService: ApiTierService, private api: ApiTierService,
              private tierService: TierService) {
    this.counter = 0;
    this.isFinished = false;
    this.diagramLabel = '';
  }

  ngOnInit(): void {
    this.getAllScooters();
  }

  parked() {
    console.log('Started API subscription');

    this.timeinterval.subscribe(x => {
      this.api
        .getListOfGroup(this.proxyurl + this.urlApi)
        .subscribe(
          data => {
            this.tierScooter = data.data;
          },
          err => {
            console.log(err);
          },
          () => {
            this.counter = this.tierScooter.length;

            this.tierService.saveScooterCount( new Livetracker(null, this.counter, null)).subscribe();

            this.tierScooter.forEach(s => {
              s.timeStamp = Date();
            });

            this.tierService.saveScooter(this.tierScooter).subscribe();
            console.log('new Scooter Data received');
            this.getAllScooters();
          });
    });
  }

  getAllScooters() {
    this.tierService.findAll().subscribe(data => {
        this.tierScooterStatistic = data;
      },
      err => {
        console.log(err);
      },
      () => {
        this.counter = this.tierScooterStatistic[this.tierScooterStatistic.length - 1].scooterCounter;
        this.tierScooterStatistic.forEach(x => {
          this.scooterActiveData.push(x.scooterCounter);
          this.yearAndDay = x.timestamp.substring(0, 10);
          this.time = x.timestamp.substring(11, 16);
          this.hour = Number(this.time.substring(0, 2));
          this.minutes = this.time.substring(2, 5);

          this.hour += 1;
          this.time = String(this.hour) + this.minutes;

          let isIncluded = false;

          this.scooterActiveDateData.forEach( y => {
            if (y === this.time) {
              isIncluded = true;
            }
          });

          if (isIncluded === false) {
            this.scooterActiveDateData.push(this.time);
          }
        });
      });
  }

}
