import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { FlashListComponent} from './flash-list/flash-list.component';
import { ApiComponent } from './api-flash/api.component';
import { FlashMapComponent } from './flash-map/flash-map.component';
import { ApiTierComponent } from './api-tier/api-tier.component';
import { TierListComponent } from './tier-list/tier-list.component';
import { TierMapComponent } from './tier-map/tier-map.component';
import { DashboardComponent } from './dashboard/dashboard.component';


const routes: Routes = [
  { path: 'flash', component: FlashListComponent},
  { path: 'tier', component: TierListComponent},
  { path: 'api/flash', component: ApiComponent},
  { path: 'api/tier', component: ApiTierComponent},
  { path: 'map/flash', component: FlashMapComponent},
  { path: 'map/tier', component: TierMapComponent},
  { path: '', component: DashboardComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
