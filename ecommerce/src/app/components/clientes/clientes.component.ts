import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from 'src/app/cliente';
import { ClienteServiceService } from 'src/app/services/cliente.service';


@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {
  
  constructor(private router: Router, private serviceCliente : ClienteServiceService) { }
  cliente : Cliente = {}
  ngOnInit(): void {

    
  }

  voltar():void{
    this.router.navigate(["nav"])
  }

  cadastrar(cliente:Cliente):void{
    this.serviceCliente.inserirCliente(cliente).subscribe(() => this.router.navigate(["home"]));
    console.log(cliente);
  }
}
