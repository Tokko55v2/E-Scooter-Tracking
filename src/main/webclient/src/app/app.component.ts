import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {AuthenticationService} from './services/authentication-service/authentication.service';
import {Router} from '@angular/router';
import {User} from './entities/user';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent {
  title: string;
  currentUser: User;

  constructor(public http: HttpClient, private router: Router,
              private authenticationService: AuthenticationService) {
    this.title = 'Scooters - Api Tracker';
    this.authenticationService.currentUser.subscribe(x => this.currentUser = x);
  }

  logout() {
    this.authenticationService.logout();
    this.router.navigate(['']);
  }

}
