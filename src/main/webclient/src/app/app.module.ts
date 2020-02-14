import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ChartsModule } from 'ng2-charts';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FlashListComponent } from './flash-list/flash-list.component';
import { ApiComponent } from './api-flash/api.component';
import { FlashMapComponent } from './flash-map/flash-map.component';
import { ApiTierComponent } from './api-tier/api-tier.component';
import { TierListComponent } from './tier-list/tier-list.component';
import { TierMapComponent } from './tier-map/tier-map.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginComponent } from './login/login.component';

import { FlashServiceService } from './services/flash-service/flash-service.service';
import { ApiServiceService } from './services/api-flash-service/api-service.service';
import { GoogleMapsModule} from '@angular/google-maps';
import { ApiTierService} from './services/api-tier-service/api-tier.service';
import { TierService} from './services/tier-service/tier.service';
import { FormBuilder, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { JwtInterceptorService} from './helpers/jwt-interceptor.service';
import { ErrorInterceptorService } from './helpers/error-interceptor.service';


@NgModule({
  declarations: [
    AppComponent,
    FlashListComponent,
    ApiComponent,
    FlashMapComponent,
    ApiTierComponent,
    TierListComponent,
    TierMapComponent,
    DashboardComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    GoogleMapsModule,
    ChartsModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [FlashServiceService, ApiServiceService, ApiTierService, TierService, FormBuilder,
    { provide: HTTP_INTERCEPTORS, useClass: JwtInterceptorService, multi: true },
    { provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptorService, multi: true },
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
