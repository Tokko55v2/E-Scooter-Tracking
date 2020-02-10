import { Component, OnInit } from '@angular/core';
import {ScooterTier} from '../entities/scooter-tier';
import {TierService} from '../services/tier-service/tier.service';

@Component({
  selector: 'app-tier-list',
  templateUrl: './tier-list.component.html',
  styleUrls: ['./tier-list.component.scss']
})
export class TierListComponent implements OnInit {
  tier: ScooterTier[];
  constructor(private tierService: TierService) { }

  ngOnInit(): void {
    this.tierService.findAll().subscribe(data => {
      this.tier = data;
    });
  }

}
