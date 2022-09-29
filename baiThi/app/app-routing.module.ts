import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';


const routes: Routes = [{
  path: '',
  loadChildren: () => import('./home/home.module').then(module => module.HomeModule)
}, {
  path: 'customer',
  loadChildren: () => import('./customer/customer.module').then(module => module.CustomerModule)
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
