import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'projeto-materias';
  personagem: any = {
    nome: 'Aragorn Elessar',
    imagem: '../../assets/aragorn.jpg',
    nomeAtor: 'Viggo Mortensen',
    descricao:
      'Aragorn, filho de Arathorn, também conhecido como Passo-Longo; foi o líder dos Dunedain do norte de Arnor e após a derrota de Sauron, Rei Elessar dos reinos unificados de Gondor e Arnor.',
  };
  action(event:any){
    console.log(event)
  }
}
