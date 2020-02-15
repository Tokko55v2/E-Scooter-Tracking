import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {ScooterTier} from '../../entities/scooter-tier';
import {Livetracker} from '../../entities/livetracker';

@Injectable({
  providedIn: 'root'
})
export class TierService {
  tierUrl: string;
  tierTrackUrl: string;
  constructor(private http: HttpClient) {
    this.tierUrl =  'http://localhost:8080/api/tier';
    this.tierTrackUrl =  'http://localhost:8080/api/tier/track';
  }

  public findXScooters(amount: number): Observable<ScooterTier[]> {
    return this.http.get<ScooterTier[]>(this.tierUrl + '/' + amount);
  }

  public findScooters(scooterPlate: string): Observable<ScooterTier[]> {
    if (scooterPlate == null) {
      return this.http.get<ScooterTier[]>(this.tierUrl + '/scooters');
    } else {
      return this.http.get<ScooterTier[]>(this.tierUrl + '/scooters/' + scooterPlate);
    }
  }

  public findAll(): Observable<Livetracker[]> {
    return this.http.get<Livetracker[]>(this.tierTrackUrl);
  }

  public saveTier(tierTracker: Livetracker) {
    return this.http.post(this.tierTrackUrl, tierTracker);
  }

  public save(tierScooter: ScooterTier[]) {
    return this.http.post<ScooterTier>(this.tierTrackUrl, tierScooter);
  }
}
