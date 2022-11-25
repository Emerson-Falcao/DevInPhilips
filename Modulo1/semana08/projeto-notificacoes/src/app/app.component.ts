import { Component } from '@angular/core';
import { NOTIFICACOES } from './mocks/notificacoes-mock';

@Component({
  selector: 'ntap-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'projeto-notificacoes';
  notificacoes = NOTIFICACOES;

  notificacaoLida(notificacao:any){
    notificacao.lido = true
    console.log(notificacao);
    
  }
}
