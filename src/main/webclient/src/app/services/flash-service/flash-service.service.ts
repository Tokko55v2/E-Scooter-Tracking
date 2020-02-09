import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Scooters } from '../../entities/scooters';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class FlashServiceService {
  flashUrl: string;
  constructor(private http: HttpClient) {
    this.flashUrl = 'http://localhost:8080/api/flash/';
  }

  public findAll(): Observable<Scooters[]> {
    return this.http.get<Scooters[]>(this.flashUrl);
  }
  public save(flashScooter: Scooters[]) {
    console.log(flashScooter[1]);
    return this.http.post<Scooters>(this.flashUrl, flashScooter);
  }
}

