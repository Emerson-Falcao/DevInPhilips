import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CapitalizePhilipsPipe } from './capitalize-philips.pipe';
import { NavbarComponent } from './navbar/navbar.component';
import { FotosComponent } from './fotos/fotos.component';
import { ModalComponent } from './modal/modal.component';

@NgModule({
  declarations: [
    AppComponent,
    CapitalizePhilipsPipe,
    NavbarComponent,
    FotosComponent,
    ModalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
