import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ChartsModule } from 'ng2-charts';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';

import { ApiTierComponent } from './api-tier/api-tier.component';
import { TierListComponent } from './tier-list/tier-list.component';
import { TierMapComponent } from './tier-map/tier-map.component';
import { DashboardComponent } from './dashboard/dashboard.component';

import { GoogleMapsModule} from '@angular/google-maps';
import { ApiTierService} from './services/api-tier-service/api-tier.service';
import { TierService} from './services/tier-service/tier.service';



@NgModule({
  declarations: [
    AppComponent,
    ApiTierComponent,
    TierListComponent,
    TierMapComponent,
    DashboardComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    GoogleMapsModule,
    ChartsModule
  ],
  providers: [ApiTierService, TierService],
  bootstrap: [AppComponent]
})
export class AppModule { }
