import { Component, OnInit } from '@angular/core';
import {ScooterTier} from '../entities/scooter-tier';
import {interval} from 'rxjs';
import {ApiTierService} from '../services/api-tier-service/api-tier.service';
import {TierService} from '../services/tier-service/tier.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-api-tier',
  templateUrl: './api-tier.component.html',
  styleUrls: ['./api-tier.component.scss']
})
export class ApiTierComponent implements OnInit {
  tierScooter: ScooterTier[];
  secondsCounter = interval(300000);
  proxyurl = 'https://cors-anywhere.herokuapp.com/';
  urlApi = 'https://platform.tier-services.io/vehicle?zoneId=VIENNA';
  constructor(private api: ApiTierService, private tierS: TierService, private router: Router) { }

  ngOnInit(): void {
      this.api
        .getListOfGroup(this.proxyurl + this.urlApi)
        .subscribe(
          data => {
            this.tierScooter = data.data;
            this.tierS.save(this.tierScooter).subscribe(res => this.goToUserList());
            console.log(data);
          },
          err => {
            console.log(err);
          }
        );
  }

  goToUserList() {
    this.router.navigate(['map']);
  }

}
