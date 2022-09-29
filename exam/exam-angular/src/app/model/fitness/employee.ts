import {Position} from './position';

export interface Employee {
  id?: number;
  code?: string;
  name?: string;
  birthDay?: string;
  gender?: string;
  position?: Position;
}
