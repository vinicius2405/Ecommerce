package br.com.loja.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loja.ecommerce.repository.FuncionarioRepositorio;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepositorio funcionarioRepositorio;
	
}
