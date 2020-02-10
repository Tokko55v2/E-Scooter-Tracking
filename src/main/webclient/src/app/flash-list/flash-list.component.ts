import { Component, OnInit } from '@angular/core';
import { Scooters } from '../entities/scooters';
import { FlashServiceService } from '../services/flash-service/flash-service.service';

@Component({
  selector: 'app-flash-list',
  templateUrl: './flash-list.component.html',
  styleUrls: ['./flash-list.component.scss']
})
export class FlashListComponent implements OnInit {
  flash: Scooters[];
  flashmoved = [];
  constructor(private flashService: FlashServiceService) { }

  ngOnInit(): void {
    this.flashService.findAll().subscribe(data => {
      this.flash = data;
    });
  }
  getDuplicate() {
    let counter = 0;
    this.flash.forEach(y => {
      const yy = y.idScooter;
      this.flash.forEach(x => {
        if (yy === x.idScooter) {
          counter++;
        }
      });
      if (counter >= 2) {
        this.flashmoved.push(y);
      }
      counter = 0;
    });
    return this.flashmoved;
  }
}
