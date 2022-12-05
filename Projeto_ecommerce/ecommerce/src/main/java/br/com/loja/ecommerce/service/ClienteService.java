package br.com.loja.ecommerce.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loja.ecommerce.models.Cliente;
import br.com.loja.ecommerce.models.dto.ClienteDto;
import br.com.loja.ecommerce.repository.ClienteRepositorio;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	
	//Incluir um cliente no banco de dados 
	public Cliente incluirCliente(ClienteDto c) throws ParseException {
		Date d1 = new SimpleDateFormat("yyyy/MM/dd").parse(c.getData_nasc());
		
		Cliente cliente = new Cliente(c.getCpf(), c.getNome(), d1, c.getSenha());
		return clienteRepositorio.save(cliente);	
	}
	
	//Listar todos os clientes 
	public List<Cliente> listarCliente(){
		return clienteRepositorio.findAll();
	}
	

	//Pegar o cliente pelo CPF
	public ClienteDto getClienteById(String cpf) {
		Cliente cliente = clienteRepositorio.getReferenceById(cpf);
		DateFormat formater = new SimpleDateFormat();
		String data = formater.format(cliente.getData_nasc());
		
		ClienteDto c = new ClienteDto(cliente.getCpf(), cliente.getNome(), data, cliente.getSenha());
		return c;
	}
	
	//Edita um cliente
	public Cliente alterar(ClienteDto c) throws ParseException {
		Date data = new SimpleDateFormat().parse(c.getData_nasc());
		Cliente cliente = new Cliente(c.getCpf(), c.getNome(), data, c.getSenha());
		return clienteRepositorio.save(cliente);
		
	}
	
}
