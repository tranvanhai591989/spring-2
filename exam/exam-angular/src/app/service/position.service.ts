import { Injectable } from '@angular/core';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

const URL_FITNESS = `${environment.apiUrl}`;


@Injectable({
  providedIn: 'root'
})
export class PositionService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Position[]> {
    return this.httpClient.get<Position[]>(URL_FITNESS + '/position/list');
  }
}
