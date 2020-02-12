import { Component, OnInit } from '@angular/core';
import {Scooters} from '../entities/scooters';
import {HttpClient} from '@angular/common/http';
import {ApiTierService} from '../services/api-tier-service/api-tier.service';
import {ScooterTier} from '../entities/scooter-tier';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {
  flash: Scooters;
  tierScooter: ScooterTier[];
  scooterZone: string;
  proxyurl = 'https://cors-anywhere.herokuapp.com/';
  urlApi = 'https://platform.tier-services.io/vehicle?zoneId=VIENNA';
  constructor(private http: HttpClient, private apiService: ApiTierService, private api: ApiTierService) { }

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
  }
}
