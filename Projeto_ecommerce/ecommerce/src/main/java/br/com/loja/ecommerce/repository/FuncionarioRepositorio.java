package br.com.loja.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.ecommerce.models.Funcionario;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, String>{
	
	

}
