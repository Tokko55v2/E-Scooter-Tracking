import { Component, OnInit } from '@angular/core';
import { Flash } from '../flash';
import { FlashServiceService } from '../flash-service.service';

@Component({
  selector: 'app-flash-list',
  templateUrl: './flash-list.component.html',
  styleUrls: ['./flash-list.component.scss']
})
export class FlashListComponent implements OnInit {
  flash: Flash[];
  constructor(private flashService: FlashServiceService) { }

  ngOnInit(): void {
    this.flashService.findAll().subscribe(data => {
      this.flash = data;
    });
  }

}
