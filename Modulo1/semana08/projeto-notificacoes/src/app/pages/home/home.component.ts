import { Component } from '@angular/core';
import { NOTIFICACOES } from 'src/app/mocks/notificacoes-mock';

@Component({
  selector: 'ntap-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  notificacoes = NOTIFICACOES;
  notificacaoLida(notificacao:any){
    notificacao.lido = true
  }

  clickFiltro(evento:any){
    console.log(evento)
  }
}
