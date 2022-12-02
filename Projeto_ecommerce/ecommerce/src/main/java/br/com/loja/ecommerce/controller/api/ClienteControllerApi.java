package br.com.loja.ecommerce.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.loja.ecommerce.models.Cliente;
import br.com.loja.ecommerce.models.dto.ClienteDto;
import br.com.loja.ecommerce.service.ClienteService;

@RestController
@RequestMapping("cliente/")
public class ClienteControllerApi {

	@Autowired
	private ClienteService clienteService;
	
	@CrossOrigin
	@PostMapping("inserir")
	public Cliente inserirCliente(@RequestBody ClienteDto clienteDto){
		try {
			return clienteService.incluirCliente(clienteDto);	
		} catch (Exception e) {
			throw new RuntimeException(); 
		}
	}
	
	@CrossOrigin
	@GetMapping("listar")
	public List<Cliente> ListarClientes(){
		return clienteService.listarCliente();
	}
	
	
	@CrossOrigin
	@GetMapping("listaById/{cpf}")
	public ClienteDto getClienteById(@PathVariable String cpf ) {
		return clienteService.getClienteById(cpf);
	}
	
	@CrossOrigin
	@PutMapping("editar")
	public Cliente editarCliente(@RequestBody ClienteDto cliente) {
		try {
			return clienteService.alterar(cliente);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
}
