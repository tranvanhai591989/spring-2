import {Component, OnInit} from '@angular/core';
import {Basic} from '../../model/fitness/basic';
import {BasicService} from '../../service/basic.service';
import {Employee} from '../../model/fitness/employee';
import {Router} from '@angular/router';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ToastrService} from 'ngx-toastr';
import {DatePipe} from '@angular/common';

@Component({
  selector: 'app-basic-create',
  templateUrl: './basic-create.component.html',
  styleUrls: ['./basic-create.component.css']
})
export class BasicCreateComponent implements OnInit {
  employeeList: Employee[] = [];
  today = this.datePipe.transform(new Date(), 'yyyy-MM-dd');

  basicForm: FormGroup = new FormGroup({
    nameB: new FormControl('', [Validators.required]),
    dayOpen: new FormControl(this.today, [Validators.required]),
    address: new FormControl('', [Validators.required]),
    employee: new FormControl('', [Validators.required]),
  });

  constructor(private basicService: BasicService,
              private router: Router,
              private toastrService: ToastrService,
              private datePipe: DatePipe) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    return this.basicService.getAllE().subscribe(employee => {
      this.employeeList = employee;
    });
  }

  submit(): void {
    const basic = this.basicForm.value;
    this.basicService.saveBasic(basic).subscribe(() => {
      this.router.navigateByUrl('basic/list');
      this.toastrService.success('Thêm thành công', 'Thông báo');
      this.basicForm.reset();
    }, e => console.log(e));
  }

}
