import { Component } from '@angular/core';

@Component({
  selector: 'app-item-card',
  templateUrl: './item-card.component.html',
  styleUrls: ['./item-card.component.css']
})
export class ItemCardComponent {
  
  personagem: any = {
    nome: 'Aragorn Elessar',
    imagem: '../../assets/aragorn.jpg',
    nomeAtor: 'Viggo Mortensen',
    descricao:
      'Aragorn, filho de Arathorn, também conhecido como Passo-Longo; foi o líder dos Dunedain do norte de Arnor e após a derrota de Sauron, Rei Elessar dos reinos unificados de Gondor e Arnor.',
  };

}
