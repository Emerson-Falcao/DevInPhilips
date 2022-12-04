import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StorageService {

  constructor(){}

  localStorageSave(valores:any){
    const json = JSON.stringify(valores)
    localStorage.setItem(valores.email,json)
  }

  getLocalStorage(key:string){
    return localStorage.getItem(key)
  }
}
