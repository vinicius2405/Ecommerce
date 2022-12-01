package br.com.loja.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.ecommerce.models.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Integer>{

}
