import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NotifHeaderComponent } from './notif-header/notif-header.component';
import { FooterComponent } from './footer/footer.component';
import { ButtonGroupComponent } from './button-group/button-group.component';

@NgModule({
  declarations: [
    AppComponent,
    NotifHeaderComponent,
    FooterComponent,
    ButtonGroupComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
