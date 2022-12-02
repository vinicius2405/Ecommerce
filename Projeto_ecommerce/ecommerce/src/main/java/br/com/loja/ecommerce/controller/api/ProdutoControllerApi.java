package br.com.loja.ecommerce.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.loja.ecommerce.models.Produto;
import br.com.loja.ecommerce.service.ProdutoService;

@RestController
@RequestMapping("produto/")
public class ProdutoControllerApi {

	@Autowired
	private ProdutoService produtoService;

	@CrossOrigin
	@PostMapping("inserir")
	private Produto inserirProduto(@RequestBody Produto produto) {
		return produtoService.inserirProduto(produto);

	}

}
