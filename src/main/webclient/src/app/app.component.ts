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
}
