import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Partidas } from './partidas-listagem/Partidas';

@Injectable({
  providedIn: 'root'
})

export class PartidaService {

  constructor(private http: HttpClient) { }

  cadastrarPartida(partida: Partidas): Observable<any>{
    return this.http.post('http://localhost:8085/api/partida', partida);
  }
  obterPartidas(): Observable<any>{
    return this.http.get('http://localhost:8085/api/partida');
  }

}
