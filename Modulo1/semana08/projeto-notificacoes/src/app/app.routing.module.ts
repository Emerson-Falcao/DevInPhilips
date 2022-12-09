import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './pages/about/about.component';
import { HomeComponent } from './pages/home/home.component';

const routes:Routes = [
  {path:'home',component:HomeComponent},
  {path:'home/lidos',component:HomeComponent},
  {path:'home/nao-lidos',component:HomeComponent},
  {path:'home/todos',component:HomeComponent},
  {path:'',component:HomeComponent},
  {path:'sobre',component:AboutComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
