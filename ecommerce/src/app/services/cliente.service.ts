import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Cliente } from '../cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteServiceService {

  constructor(private http : HttpClient) { }

  url : String = ""
  inserirCliente(cliente : Cliente) : Observable<Cliente>{
    return this.http.post<Cliente>(url,cliente)
  } 

}
