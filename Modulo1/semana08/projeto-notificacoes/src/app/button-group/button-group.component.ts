import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'ntap-button-group',
  templateUrl: './button-group.component.html',
  styleUrls: ['./button-group.component.scss']
})
export class ButtonGroupComponent {
    buttons = ['Todos','Lidos','Não Lidos']

    @Output() evento:EventEmitter<string> = new EventEmitter();

    clickFiltro(event:any){
      this.evento.emit(event)
    }
}
