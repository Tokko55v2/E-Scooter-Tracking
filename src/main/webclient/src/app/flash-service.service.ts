import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Flash } from './flash';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FlashServiceService {
  flashUrl: string;
  constructor(private http: HttpClient) {
    this.flashUrl = 'http://localhost:8080/api/flash/';
  }

  public findAll(): Observable<Flash[]> {
    return this.http.get<Flash[]>(this.flashUrl);
  }
  public save(flash: Flash) {
    return this.http.post<Flash>(this.flashUrl, flash);
  }
}

