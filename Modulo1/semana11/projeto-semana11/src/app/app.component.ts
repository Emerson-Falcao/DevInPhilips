import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <app-navbar></app-navbar>
    <app-fotos></app-fotos>
    <app-modal></app-modal>
  `,
  styles: []
})
export class AppComponent {
  title = 'projeto-semana11';
}
