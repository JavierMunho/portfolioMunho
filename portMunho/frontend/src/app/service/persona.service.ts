import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../models/person.model';



@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  URL = 'https://git.heroku.com/backendportnjm.git/persona/';
  constructor(private http: HttpClient) { }

  public getPersona(): Observable<persona>{
    return this.http.get<persona>(this.URL + 'traer/perfil')
  }
}
