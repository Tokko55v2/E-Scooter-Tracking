import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FlashListComponent } from './flash-list/flash-list.component';
import { HttpClientModule } from '@angular/common/http';
import { FlashServiceService } from './services/flash-service/flash-service.service';
import { ApiComponent } from './api/api.component';
import { ApiServiceService } from './services/ApiService/api-service.service';
import { GoogleMapsModule} from '@angular/google-maps';
import { FlashMapComponent } from './flash-map/flash-map.component';


@NgModule({
  declarations: [
    AppComponent,
    FlashListComponent,
    ApiComponent,
    FlashMapComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    GoogleMapsModule
  ],
  providers: [FlashServiceService, ApiServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
