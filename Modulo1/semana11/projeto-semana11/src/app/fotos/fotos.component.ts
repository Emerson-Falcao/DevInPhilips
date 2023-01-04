import { Component } from '@angular/core';

@Component({
  selector: 'app-fotos',
  template: `
    <div *ngFor="let foto of this.arrayFotos" class = 'container'>
      <div class="card" style="width: 18rem;">
        <img [src]="foto.url" class="card-img-top" alt="...">
        <div class="card-body">
          <p class="card-text">{{foto.description}}</p>
        </div>
      </div>
    </div>
  `,
  styles: [
  ]
})
export class FotosComponent {
  arrayFotos: any = [
    {
      url: "https://cdn.pocket-lint.com/r/s/x1920/assets/images/159088-games-review-hands-on-elden-ring-review-image1-8nisaeviok.jpg",
      description:"Elden Ring, o mais novo jogo da empresa FromSoftware, tendo como maior diferencial o mundo aberto"
    },
    {
      url: "https://cdn-ext.fanatical.com/production/product/1280x720/7663144c-139a-4355-8a33-1500c39e517c.jpeg",
      description:"Dragon's Dogma, RPG de ação desenvolvido pela CAPCOM, que tem como destaque um sistema profundo de classes e magias"
    },
    {
      url: "https://cdn1.epicgames.com/salesEvent/salesEvent/EGS_Warhammer40000Battlesector_BlackLabGames_S3_2560x1440-dd42edda3befb18ad52397abbefcfbaa",
      description:"Warhammer 40K: BattleSector, jogo de estratégia em turnos da aclamada franquia de jogos de tabuleiro"
    },
    {
      url: "https://store-images.s-microsoft.com/image/apps.56995.13869736752294987.ca050464-c72a-476d-941d-c1c814c4213d.086da48d-2bd1-47fd-85eb-cf98f6225882?q=90&w=480&h=270",
      description:"Fallout New Vegas, jogo de RPG em primeira pessoa que coloca o jogador no oeste americano séculos depois de um apocalipse nuclear "
    },
    {
      url: "https://cdn.cloudflare.steamstatic.com/steam/apps/410320/capsule_616x353.jpg?t=1668586053",
      description:"Earth Defense Force 4.1, jogo de ação onde o jogador toma o controle de um soldado com armas futuristas contra uma invasão de insetos gigantes alienigenas"
    }
  ]
}
