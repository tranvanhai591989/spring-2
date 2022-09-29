import {Component, OnInit} from '@angular/core';
import {Basic} from '../../model/fitness/basic';
import {BasicService} from '../../service/basic.service';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-basic-list',
  templateUrl: './basic-list.component.html',
  styleUrls: ['./basic-list.component.css']
})
export class BasicListComponent implements OnInit {
  basicList: Basic[] = [];
  private idDelete: number;
  private name: string;
  private code: string;
  private birthDay: string;
  private gender: string;
  private position: string;
  private nameE: string;

  constructor(private basicService: BasicService,
              private toastrService: ToastrService) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    return this.basicService.getAllB().subscribe(basic => {
      this.basicList = basic;
    });
  }

  showDelete(basic: Basic) {
    this.idDelete = basic.id;
    this.name = basic.nameB;
  }

  delete(idDelete: number) {
    this.basicService.delete(idDelete).subscribe(() => {
      this.basicList = this.basicList.filter(t => t.id !== idDelete);
      this.toastrService.success('Xóa thành công', 'Cảnh báo');
      this.ngOnInit();
    }, error => {
      console.log(error);
    });
  }

  showDetail(basic: Basic) {
    this.code = basic.employee.code;
    this.nameE = basic.employee.name;
    this.birthDay = basic.employee.birthDay;
    this.gender = basic.employee.gender;
    this.position = basic.employee.position.name;
  }


}
