import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { PartidasListagemComponent } from './partidas-listagem/partidas-listagem.component';
import { PartidaService } from './partida.service';



@NgModule({
  declarations: [
    AppComponent,
    PartidasListagemComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [HttpClientModule, PartidaService],
  bootstrap: [AppComponent]
})
export class AppModule { }
