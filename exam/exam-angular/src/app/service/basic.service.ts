import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {Employee} from '../model/fitness/employee';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';
import {Basic} from '../model/fitness/basic';

const URL_FITNESS = `${environment.apiUrl}`;

@Injectable({
  providedIn: 'root'
})
export class BasicService {

  constructor(private httpClient: HttpClient) {
  }

  getAllE(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(URL_FITNESS + 'fitness/employee/list');
  }

  getAllP(): Observable<Position[]> {
    return this.httpClient.get<Position[]>(URL_FITNESS + 'fitness/position/list');
  }

  getAllB(): Observable<Basic[]> {
    return this.httpClient.get<Basic[]>(URL_FITNESS + 'fitness/basic/list');
  }

  saveBasic(basic): Observable<Basic> {
    return this.httpClient.post<Basic>(URL_FITNESS + 'fitness/basic/create', basic);
  }

  delete(idDelete: number) {
    return this.httpClient.delete<Basic>(URL_FITNESS + 'fitness/basic/delete/' + idDelete);
  }
}
