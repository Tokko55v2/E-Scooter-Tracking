import { Component, OnInit } from '@angular/core';
import { ApiServiceService } from '../services/ApiService/api-service.service';
import {FlashServiceService} from '../services/flash-service/flash-service.service';
import {Scooters} from '../entities/scooters';
import {Router} from '@angular/router';

@Component({
  selector: 'app-api',
  templateUrl: './api.component.html',
  styleUrls: ['./api.component.scss']
})
export class ApiComponent implements OnInit {
  scooter: Scooters[];

  urlApi = 'https://api.goflash.com/api/Mobile/Scooters?' +
    'userLatitude=47.36&userLongitude=8.55&lang=de&latitude=47.36' +
    '&longitude=8.55&latitudeDelta=0.01&longitudeDelta=0.01';
  constructor(private api: ApiServiceService, private flashS: FlashServiceService,
              private router: Router) { }

  ngOnInit(): void {
    this.api
      .getListOfGroup(this.urlApi)
      .subscribe(
        data => {
          this.scooter = data.Data.Scooters;
          console.log(data.Data.Scooters);
          this.flashS.save(data.Data.Scooters).subscribe(result => this.goToUserList());
        },
        err => {
          console.log(err);
        }
      );
  }

  goToUserList() {
    this.router.navigate(['api/flash']);
  }

}
