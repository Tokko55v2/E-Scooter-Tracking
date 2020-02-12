import {Component, OnInit } from '@angular/core';
import {ScooterTier} from '../entities/scooter-tier';
import {TierService} from '../services/tier-service/tier.service';
import { tap } from 'rxjs/operators';
import {Router} from '@angular/router';

@Component({
  selector: 'app-tier-list',
  templateUrl: './tier-list.component.html',
  styleUrls: ['./tier-list.component.scss']
})
export class TierListComponent implements OnInit {
  tier: ScooterTier[];
  error: any;
  isLoading$: boolean;
  amount: number;

  constructor(private tierService: TierService, private router: Router) {this.amount = 150; }

  ngOnInit(): void {
    this.getAmount( this.amount );
  }


  getAmount(amount: number ): void {
   this.tierService.findXScooters(amount).pipe(
      tap(() => {this.isLoading$ = true; })).subscribe(data => {
      this.tier = data;
    }, err => {
      this.error = err;
    });
   this.isLoading$ = false;
  }


  getAll(): void {
    this.tierService.findScooters(null).pipe(
      tap(() => {this.isLoading$ = true; })).subscribe(data => {
      this.tier = data;
    }, err => {
      this.error = err;
    });
    this.isLoading$ = false;
  }


  getSpecificScooter(scooterPlate: string) {
    localStorage.setItem('scooterPlate', scooterPlate);
    this.router.navigate(['/map/tier']);
  }

}
