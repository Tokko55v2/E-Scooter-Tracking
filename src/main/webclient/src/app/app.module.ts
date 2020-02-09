import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GoogleMapsComponent } from './google-maps/google-maps.component';
import { FlashListComponent } from './flash-list/flash-list.component';
import { HttpClientModule } from '@angular/common/http';
import { FlashServiceService } from './services/flash-service/flash-service.service';
import { ApiComponent } from './api/api.component';
import { ApiServiceService } from './services/ApiService/api-service.service';


@NgModule({
  declarations: [
    AppComponent,
    GoogleMapsComponent,
    FlashListComponent,
    ApiComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [FlashServiceService, ApiServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
