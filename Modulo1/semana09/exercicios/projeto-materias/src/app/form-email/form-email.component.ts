import { Component, Inject } from '@angular/core';
import { StorageService } from '../storage.service';

@Component({
  selector: 'app-form-email',
  templateUrl: './form-email.component.html',
  styleUrls: ['./form-email.component.css']
})
export class FormEmailComponent {
  valores = {
    email:'',
    senha:''
  }

  constructor(private Storage:StorageService){ }

  enviar(event:any){
    event.preventDefault()
    this.Storage.localStorageSave(this.valores)
    console.log(this.Storage.getLocalStorage(this.valores.email))
  }
}
