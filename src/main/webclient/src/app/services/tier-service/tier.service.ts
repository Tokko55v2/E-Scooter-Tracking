import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {ScooterTier} from '../../entities/scooter-tier';
import {Livetracker} from '../../entities/livetracker';
import {environment} from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class TierService {
  proxyUrl: string;

  constructor(private http: HttpClient) {
  }

  public findXScooters(amount: number): Observable<ScooterTier[]> {
    return this.http.get<ScooterTier[]>(this.proxyUrl + environment.tierUrl + '/' + amount);
  }

  public findScooters(scooterPlate: string): Observable<ScooterTier[]> {
    if (scooterPlate == null) {
      return this.http.get<ScooterTier[]>(this.proxyUrl + environment.tierUrl + '/scooters');
    } else {
      return this.http.get<ScooterTier[]>(this.proxyUrl + environment.tierUrl + '/scooters/' + scooterPlate);
    }
  }

  public findAll(): Observable<Livetracker[]> {
    return this.http.get<Livetracker[]>(this.proxyUrl + environment.tierTrackUrl);
  }

  public saveTier(tierTracker: Livetracker) {
    return this.http.post(this.proxyUrl + environment.tierTrackUrl, tierTracker);
  }

  public save(tierScooter: ScooterTier[]) {
    return this.http.post<ScooterTier>(this.proxyUrl + environment.tierTrackUrl, tierScooter);
  }
}
