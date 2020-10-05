import { Component, OnInit } from '@angular/core';
import { PartidaService } from '../partida.service';
import { Partidas } from './Partidas';

@Component({
  selector: 'app-partidas-listagem',
  templateUrl: './partidas-listagem.component.html',
  styleUrls: ['./partidas-listagem.component.css']
})
export class PartidasListagemComponent implements OnInit {

  partida: Partidas = new Partidas();
  partidas: Array<any> = [];

  constructor(private partidaService: PartidaService) { }

  ngOnInit(): void {
    this.obterPartidas();
  }
  cadastrar(): void {
    this.partidaService.cadastrarPartida(this.partida).subscribe(partida => {
      this.partida = new Partidas();
      this.partida.minimoTemporada = this.partidas.reduce((a, b) => Math.min(a, b));
      this.partida.maximoTemporada = this.partidas.reduce((a, b) => Math.max(a, b));
      this.partida.quebraRecordeMaximo = this.partida.placar > this.partida.maximoTemporada;
      this.partida.quebraRecordeMinimo = this.partida.placar < this.partida.minimoTemporada;
      this.obterPartidas();
    }, err => {
      console.log('Erro ao cadastrar registro', err);
    });
  }
  obterPartidas(): void {
    this.partidaService.obterPartidas().subscribe(partidas => {
      this.partidas = partidas;
    }, err => {
      console.log('Erro ao listar dados', err);
  });
  }
  }
