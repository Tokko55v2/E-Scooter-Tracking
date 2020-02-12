import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent {
  title: string;
  constructor(public http: HttpClient) {
    this.title = 'Scooters - Api Tracker';
  }

}
