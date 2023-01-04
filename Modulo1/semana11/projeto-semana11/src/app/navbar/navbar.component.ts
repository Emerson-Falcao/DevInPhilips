import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar',
  template: `
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link active" href="#" (click)='this.setPage("Home")'>Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#" (click)='this.setPage("Preços")'>Preços</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#" (click)='this.setPage("Info")'>Informações</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <div [ngSwitch]="this.page">
      <h2 *ngSwitchCase="'Home'">Estou na página de Home</h2>
      <h2 *ngSwitchCase="'Preços'">Estou na página de Preços</h2>
      <h2 *ngSwitchCase="'Info'">Estou na página de Informações</h2>
    </div>
  `,
  styles: [
  ]
})
export class NavbarComponent {
    page:string = ''

    setPage(value:string){
      this.page = value
    }
}
