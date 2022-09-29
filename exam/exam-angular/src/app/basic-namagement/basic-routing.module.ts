import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {BasicListComponent} from './basic-list/basic-list.component';
import {BasicCreateComponent} from './basic-create/basic-create.component';


const routes: Routes = [
  {path: 'list', component: BasicListComponent},
  {path: 'create', component: BasicCreateComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BasicRoutingModule { }
