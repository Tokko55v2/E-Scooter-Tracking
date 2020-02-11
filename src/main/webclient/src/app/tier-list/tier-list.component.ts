import {Component, OnInit} from '@angular/core';
import {ScooterTier} from '../entities/scooter-tier';
import {TierService} from '../services/tier-service/tier.service';
import { tap } from 'rxjs/operators';

@Component({
  selector: 'app-tier-list',
  templateUrl: './tier-list.component.html',
  styleUrls: ['./tier-list.component.scss']
})
export class TierListComponent implements OnInit {
  tier: ScooterTier[];
  obs: any;
  error: any;
  isLoading$: boolean;
  amount: number;
  constructor(private tierService: TierService) {this.amount = 150; }

  ngOnInit(): void {
    this.getAmount( this.amount );
  }
  public getAmount(amount: number ): void {
    this.obs = this.tierService.findXScooters(amount).pipe(
      tap(() => {this.isLoading$ = true; })).subscribe(data => {
      this.tier = data;
    }, err => {
      this.error = err;
    });
    this.isLoading$ = false;
  }
  public getAll(): void {
    this.obs = this.tierService.findAll().pipe(
      tap(() => {this.isLoading$ = true; })).subscribe(data => {
      this.tier = data;
    }, err => {
      this.error = err;
    });
    this.isLoading$ = false;
  }

}
