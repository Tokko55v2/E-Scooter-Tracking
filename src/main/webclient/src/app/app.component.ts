import { Component } from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';
import {Scooters} from './entities/scooters';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent {
  title: string;
  flash: Scooters;
  constructor(public http: HttpClient) {
    this.title = 'Scooters - Api Tracker';
  }
  makeRequest(): void {
    this.http.get('https://api.goflash.com/api/Mobile/Scooters?userLatitude=47.36' +
      '&userLongitude=8.55&lang=de&latitude=47.36&longitude=8.55&latitudeDelta=0.01&longitudeDelta=0.01')
      .subscribe((res: HttpResponse<any>) => {
        console.log(res.body.data);
      });
  }
}
