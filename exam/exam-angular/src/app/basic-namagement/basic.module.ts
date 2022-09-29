import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BasicRoutingModule } from './basic-routing.module';
import { BasicListComponent } from './basic-list/basic-list.component';
import { BasicCreateComponent } from './basic-create/basic-create.component';
import {ReactiveFormsModule} from '@angular/forms';


@NgModule({
  declarations: [BasicListComponent, BasicCreateComponent],
  imports: [
    CommonModule,
    BasicRoutingModule,
    ReactiveFormsModule
  ]
})
export class BasicModule { }
