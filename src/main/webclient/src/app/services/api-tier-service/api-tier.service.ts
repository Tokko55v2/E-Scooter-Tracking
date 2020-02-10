import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpErrorResponse} from '@angular/common/http';
import {Observable, throwError} from 'rxjs';
import {catchError, map} from 'rxjs/operators';

const httpOptions = {
  headers: new HttpHeaders(
    {'Content-Type': 'application/json', Authorization: 'c31z',
    'X-Api-Key': 'bpEUTJEBTf74oGRWxaIcW7aeZMzDDODe1yBoSxi2'})
};


@Injectable({
  providedIn: 'root'
})
export class ApiTierService {

  constructor(private http: HttpClient) { }

  private handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      console.error('An error occurred: ', error.error.toString());
    } else {
      console.error('Backend returned code ${error.status}, ' + ' body was: ${error.error}');
    }
    return throwError(error);
  }

  private extractData(res: Response) {
    const body = res;
    return body || {};
  }
  public getListOfGroup(url: string): Observable<any> {
    return this.http.get(url, httpOptions).pipe(
      map(this.extractData),
      catchError(this.handleError)
    );
  }
}
