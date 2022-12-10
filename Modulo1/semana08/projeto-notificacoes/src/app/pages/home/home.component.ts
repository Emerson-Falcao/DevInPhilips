import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NOTIFICACOES } from 'src/app/mocks/notificacoes-mock';

@Component({
  selector: 'ntap-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  notificacoes = NOTIFICACOES;
  status:any;
  public constructor(private route:ActivatedRoute, private router:Router) {
    this.status = route.snapshot.data['status']
    if(this.status=='lidos'){
      this.notificacoes = this.notificacoes.filter(notificacao => notificacao.lido)
    }
    if(this.status=='nao-lidos'){
      this.notificacoes = this.notificacoes.filter(notificacao => !notificacao.lido)
    }
  }
  notificacaoLida(notificacao:any){
    notificacao.lido = true
  }

  clickFiltro(evento:any){
    console.log(evento.target.innerText)
  }
}
