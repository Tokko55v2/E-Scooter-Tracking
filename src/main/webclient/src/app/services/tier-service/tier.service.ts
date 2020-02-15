import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {ScooterTier} from '../../entities/scooter-tier';
import {Livetracker} from '../../entities/livetracker';
import {environment} from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class TierService {

  constructor(private http: HttpClient) {
  }

  public findXScooters(amount: number): Observable<ScooterTier[]> {
    return this.http.get<ScooterTier[]>(environment.tierUrl + '/' + amount);
  }

  public findScooters(scooterPlate: string): Observable<ScooterTier[]> {
    if (scooterPlate == null) {
      return this.http.get<ScooterTier[]>( environment.tierUrl + '/scooters');
    } else {
      return this.http.get<ScooterTier[]>(  environment.tierUrl + '/scooters/' + scooterPlate);
    }
  }

  public findAll(): Observable<Livetracker[]> {
    return this.http.get<Livetracker[]>(environment.tierTrackUrl);
  }

  public saveTier(tierTracker: Livetracker) {
    return this.http.post( environment.tierTrackUrl, tierTracker);
  }

  public save(tierScooter: ScooterTier[]) {
    return this.http.post<ScooterTier>(environment.tierTrackUrl, tierScooter);
  }
}
