package br.com.loja.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.loja.ecommerce.models.Produto;
import br.com.loja.ecommerce.repository.ProdutoRepositorio;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepositorio produtoRepositorio;

	// Inserir um produto
	public Produto inserirProduto(Produto produto) {

		return produtoRepositorio.save(produto);

	}

}
