package br.com.loja.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.ecommerce.models.Avaliacao;

public interface AvaliacaoRepositorio extends JpaRepository<Avaliacao, Integer>{

}
