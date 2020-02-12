import { Component, OnInit } from '@angular/core';
import {Scooters} from '../entities/scooters';
import {HttpClient} from '@angular/common/http';
import {ApiTierService} from '../services/api-tier-service/api-tier.service';
import {ScooterTier} from '../entities/scooter-tier';
import {TierService} from '../services/tier-service/tier.service';
import {Livetracker} from '../entities/livetracker';
import {tap} from "rxjs/operators";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {
  flash: Scooters;
  tierScooter: ScooterTier[];
  liveTracker: Livetracker;

  proxyurl = 'https://cors-anywhere.herokuapp.com/';
  urlApi = 'https://platform.tier-services.io/vehicle?zoneId=VIENNA';


  constructor(private http: HttpClient, private apiService: ApiTierService, private api: ApiTierService, private tierService: TierService) { }

  ngOnInit(): void {
     this.api
       .getListOfGroup(this.proxyurl + this.urlApi)
       .subscribe(
         data => {
           this.tierScooter = data.data;
         },
         err => {
           console.log(err);
         });

     this.liveTracker = new Livetracker(null, , 652, null);
     this.tierService.saveTier(this.liveTracker).subscribe();
  }
}
