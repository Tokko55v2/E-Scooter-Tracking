import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthGuardService} from './helpers/auth-guard.service';

import { FlashListComponent} from './flash-list/flash-list.component';
import { ApiComponent } from './api-flash/api.component';
import { FlashMapComponent } from './flash-map/flash-map.component';
import { ApiTierComponent } from './api-tier/api-tier.component';
import { TierListComponent } from './tier-list/tier-list.component';
import { TierMapComponent } from './tier-map/tier-map.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
  { path: '', component: LoginComponent},
  { path: 'flash', component: FlashListComponent, canActivate: [AuthGuardService]},
  { path: 'tier', component: TierListComponent, canActivate: [AuthGuardService]},
  { path: 'api/flash', component: ApiComponent, canActivate: [AuthGuardService]},
  { path: 'api/tier', component: ApiTierComponent, canActivate: [AuthGuardService]},
  { path: 'map/flash', component: FlashMapComponent, canActivate: [AuthGuardService]},
  { path: 'map/tier', component: TierMapComponent, canActivate: [AuthGuardService]},
  { path: 'dashboard', component: DashboardComponent, canActivate: [AuthGuardService]},
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
