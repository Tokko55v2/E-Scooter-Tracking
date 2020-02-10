import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {ScooterTier} from '../../entities/scooter-tier';

@Injectable({
  providedIn: 'root'
})
export class TierService {
  tierUrl: string;
  constructor(private http: HttpClient) {
    this.tierUrl = 'http://localhost:8080/api/tier';
  }
  public findAll(): Observable<ScooterTier[]> {
    return this.http.get<ScooterTier[]>(this.tierUrl);
  }
  public save(tierScooter: ScooterTier[]) {
    return this.http.post<ScooterTier>(this.tierUrl, tierScooter);
  }
}
