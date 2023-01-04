import { Component } from '@angular/core';

@Component({
  selector: 'app-modal',
  template: `
    <div class="cardModal">
      <a (click)='this.setShowModal()'>Open Demo Modal</a>
    </div>

    <div class="modal" *ngIf="this.showModal">
      <div class="modal__content">
        <h1>Example modal</h1>
        <p>
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Error minima
          libero veniam, modi corrupti doloremque repellendus vitae mollitia. Ipsum
          voluptatibus ea ab quos molestiae at expedita maiores dolore a corrupti!
        </p>
        <a class="modal__close" (click)='this.setShowModal()'>&times;</a>
      </div>
    </div>
  `,
  styles: [
  ]
})
export class ModalComponent {
    showModal:boolean = false
    setShowModal(){
      this.showModal = !this.showModal
      console.log(this.showModal)
    }
}
