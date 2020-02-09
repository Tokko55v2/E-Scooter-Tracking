import {Component, OnInit, ViewChild} from '@angular/core';
import {GoogleMap, MapInfoWindow, MapMarker} from '@angular/google-maps';
import {FlashServiceService} from '../services/flash-service/flash-service.service';
import {Scooters} from '../entities/scooters';

@Component({
  selector: 'app-flash-map',
  templateUrl: './flash-map.component.html',
  styleUrls: ['./flash-map.component.scss']
})
export class FlashMapComponent implements OnInit {
  @ViewChild(GoogleMap, { static: false }) map: GoogleMap;
  @ViewChild(MapInfoWindow, { static: false }) info: MapInfoWindow;

  constructor(private flashService: FlashServiceService) { }
  scooter: Scooters[];
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

  ngOnInit(): void {
    this.flashService.findAll().subscribe(data => {
      this.scooter = data;
      this.center = {
        lat: this.scooter[0].location.latitude,
        lng: this.scooter[0].location.longitude,
      };
      this.scooter.forEach((scooter) => {
        console.log(scooter.location.longitude);
        this.markers.push({
          position: {
            lat: scooter.location.latitude,
            lng: scooter.location.longitude,
          },
          label: {
            color: 'white',
            text: scooter.PowerPercent + '%',
          },
          clickable: true,
          title: scooter.CityName,
          info: scooter.idScooter + ' ID',
          options: {
            animation: google.maps.Animation.DROP,
          },
        });
      });
    });
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
