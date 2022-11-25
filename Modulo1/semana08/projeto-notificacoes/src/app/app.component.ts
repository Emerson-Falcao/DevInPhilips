import { Component } from '@angular/core';

@Component({
  selector: 'ntap-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'projeto-notificacoes';
  notificacoes = [
    {
      titulo:'Novo pedido de amizade!',
      subtitulo:'Uma pessoa te mandou um pedido de amizade!',
      data: new Date('2022-11-26')
    },
    {
      titulo:'Curtida!',
      subtitulo:'Sua postagem foi curtida',
      data: new Date('2022-11-25')
    },
    {
      titulo:'Novo comentário!',
      subtitulo:'Sua postagem recebeu um novo comentário',
      data: new Date('2022-11-25')
    }
  ]
}
