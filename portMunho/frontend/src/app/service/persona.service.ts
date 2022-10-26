import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../models/person.model';



@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  URL = /proxy/+'personas/';
  constructor(private http: HttpClient) { }

  public getPersona(): Observable<persona>{
    return this.http.get<persona>(this.URL + 'traer/perfil')
  }
}
