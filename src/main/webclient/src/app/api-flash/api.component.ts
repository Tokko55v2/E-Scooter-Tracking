import { Component, OnInit } from '@angular/core';
import { ApiServiceService } from '../services/api-flash-service/api-service.service';
import {FlashServiceService} from '../services/flash-service/flash-service.service';
import {Scooters} from '../entities/scooters';
import {Router} from '@angular/router';
import {interval} from 'rxjs';

@Component({
  selector: 'app-api',
  templateUrl: './api.component.html',
  styleUrls: ['./api.component.scss']
})
export class ApiComponent implements OnInit {
  scooter: Scooters[];
  secondsCounter = interval(300);
  urlApi = 'https://api-flash.goflash.com/api-flash/Mobile/Scooters?' +
    'userLatitude=47.36&userLongitude=8.55&lang=de&latitude=47.36' +
    '&longitude=8.55&latitudeDelta=10.00&longitudeDelta=10.00';
  constructor(private api: ApiServiceService, private flashS: FlashServiceService,
              private router: Router) { }

  ngOnInit(): void {
    this.secondsCounter.subscribe(x =>
      this.api
      .getListOfGroup(this.urlApi)
      .subscribe(
        data => {
          this.scooter = data.Data.Scooters;
          console.log('Called Api');
          this.flashS.save(data.Data.Scooters).subscribe(result => this.goToUserList());
        },
        err => {
          console.log(err);
        }
      )
    );
  }

  goToUserList() {
    this.router.navigate(['map']);
  }

}
