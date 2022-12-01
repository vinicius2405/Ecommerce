package br.com.loja.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.ecommerce.models.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, String>{

}
