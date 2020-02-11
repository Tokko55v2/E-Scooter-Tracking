import {Component, OnInit, ViewChild} from '@angular/core';
import {GoogleMap, MapInfoWindow, MapMarker} from '@angular/google-maps';
import {TierService} from '../services/tier-service/tier.service';
import {ScooterTier} from '../entities/scooter-tier';
import {tap} from 'rxjs/operators';

@Component({
  selector: 'app-tier-map',
  templateUrl: './tier-map.component.html',
  styleUrls: ['./tier-map.component.scss']
})
export class TierMapComponent implements OnInit {
  @ViewChild(GoogleMap, { static: false }) map: GoogleMap;
  @ViewChild(MapInfoWindow, { static: false }) info: MapInfoWindow;

  constructor(private tierService: TierService) { }
  scooter: ScooterTier[];
  zoom = 12;
  center: google.maps.LatLngLiteral;
  option: google.maps.MapOptions = {
    zoomControl: true,
    scrollwheel: true,
    disableDoubleClickZoom: true,
    maxZoom: 100,
    minZoom: 1,
  };
  markers = [];
  infoContent = '';
  isLoading$: boolean;
  ngOnInit(): void {
    this.tierService.findAll().pipe(
      tap(() => {this.isLoading$ = true; })
    ).subscribe(data => {
      this.scooter = data;
      this.center = {
        lat: this.scooter[0].lat,
        lng: this.scooter[0].lng,
      };
      this.scooter.forEach((scooter) => {
        this.markers.push({
          position: {
            lat: scooter.lat,
            lng: scooter.lng,
          },
          clickable: true,
          info: scooter.batteryLevel + ' %',
          options: {
            animation: google.maps.Animation.DROP,
          },
        });
      });
    });
    this.isLoading$ = false;
  }

  zoomIn() {
    if (this.zoom < this.option.maxZoom) {
      this.zoom++;
    }
  }
  zoomOut() {
    if (this.zoom > this.option.minZoom) {
      this.zoom--;
    }
  }
  click(event: google.maps.MouseEvent) {
    console.log(event);
  }
  openInfo(marker: MapMarker, content) {
    this.infoContent = content;
    this.info.open(marker);
  }

  logCenter() {
    console.log(JSON.stringify(this.map.getCenter()));
  }

}
