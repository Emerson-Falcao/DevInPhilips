import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'projeto-cont';
  cont = 0;
  
  increaseCont(){
    this.cont++
  }

  decreaseCont(){
    this.cont--
  }
}
