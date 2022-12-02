import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Cliente } from '../cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteServiceService {

  constructor(private http : HttpClient) { }

  url : string = "http://localhost:8080/cliente/inserir";

  public inserirCliente(cliente : Cliente) : Observable<Cliente>{
    return this.http.post<Cliente>(this.url,cliente);
  } 

}
