export class Scooters {
  id: string;
  idScooter: number;
  idCity: string;
  scooterCode: string;
  idScooterState: string;
  Distance: number;
  PowerPercent: string;
  RemainderRange: string;
  ScooterModel: string;
  IsBookable: boolean;
  IsToolable: boolean;
  StreetInfo: string;
  StreetInfo2: string;
  txtRentalPrice: string;
  Locked: boolean;
  location: {
    latitude: number;
    longitude: number;
  };
  GoogleMapsMode: string;
  GoogleMapsEstimatedTimeRatio: number;
  CostEstimationEnabled: boolean;
  CityName: string;
  GSMCoverage: number;
  SatelliteNumber: number;
  GPSStatus_txt: string;
  GPSStatus_sort: string;
}
