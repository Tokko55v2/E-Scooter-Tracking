import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FlashListComponent} from './flash-list/flash-list.component';


const routes: Routes = [
  { path: 'api/flash', component: FlashListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
