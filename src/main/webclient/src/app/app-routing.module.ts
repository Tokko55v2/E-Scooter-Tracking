import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FlashListComponent} from './flash-list/flash-list.component';
import { ApiComponent } from './api-flash/api.component';
import { FlashMapComponent } from './flash-map/flash-map.component';
import {ApiTierComponent} from './api-tier/api-tier.component';


const routes: Routes = [
  { path: 'flash', component: FlashListComponent},
  { path: 'api/flash', component: ApiComponent},
  { path: 'map', component: FlashMapComponent},
  { path: 'api/tier', component: ApiTierComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
