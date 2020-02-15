import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ApiTierComponent } from './api-tier/api-tier.component';
import { TierListComponent } from './tier-list/tier-list.component';
import { TierMapComponent } from './tier-map/tier-map.component';
import { DashboardComponent } from './dashboard/dashboard.component';


const routes: Routes = [
  { path: 'tier', component: TierListComponent},
  { path: 'api/tier', component: ApiTierComponent},
  { path: 'map/tier', component: TierMapComponent},
  { path: '', component: DashboardComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
