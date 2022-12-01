import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from 'src/app/cliente';


@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {
  cliente : Cliente = {}
  constructor(private router: Router) { }

  ngOnInit(): void {

    this.cliente = {cpf : "", nome : "", data_nasc : "", senha : ""}
  }

  voltar(){
    this.router.navigate(["nav"])
  }

  cadastrar(){
    this.router.navigate(["nav"])

  }
}
