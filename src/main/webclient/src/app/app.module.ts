import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GoogleMapsComponent } from './google-maps/google-maps.component';
import { FlashListComponent } from './flash-list/flash-list.component';
import { HttpClientModule} from '@angular/common/http';
import { FlashServiceService } from './flash-service.service';


@NgModule({
  declarations: [
    AppComponent,
    GoogleMapsComponent,
    FlashListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [FlashServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
