import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FlashListComponent } from './flash-list/flash-list.component';
import { HttpClientModule } from '@angular/common/http';
import { FlashServiceService } from './services/flash-service/flash-service.service';
import { ApiComponent } from './api-flash/api.component';
import { ApiServiceService } from './services/api-flash-service/api-service.service';
import { GoogleMapsModule} from '@angular/google-maps';
import { FlashMapComponent } from './flash-map/flash-map.component';
import { ApiTierComponent } from './api-tier/api-tier.component';
import { ApiTierService} from './services/api-tier-service/api-tier.service';
import { TierService} from './services/tier-service/tier.service';
import { TierListComponent } from './tier-list/tier-list.component';
import { TierMapComponent } from './tier-map/tier-map.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ChartsModule } from 'ng2-charts';


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
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    GoogleMapsModule,
    ChartsModule
  ],
  providers: [FlashServiceService, ApiServiceService, ApiTierService, TierService],
  bootstrap: [AppComponent]
})
export class AppModule { }
