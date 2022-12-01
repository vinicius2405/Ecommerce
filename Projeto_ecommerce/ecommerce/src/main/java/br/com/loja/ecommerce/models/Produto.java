package br.com.loja.ecommerce.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "CATEGORIA")
	private String categoria;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "COR")
	private String cor;
	
	@Column(name = "PRECO")
	private Double preco;
	
	@Column(name = "QTD")
	private int qtd;
	
	@Column(name = "IMG_FRENTE")
	private String img_frente;
	
	@Column(name = "IMG_VERSO")
	private String img_verso;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "produto")
	private List<Avaliacao> avaliacoes;

	
	
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getImg_frente() {
		return img_frente;
	}

	public void setImg_frente(String img_frente) {
		this.img_frente = img_frente;
	}

	public String getImg_verso() {
		return img_verso;
	}

	public void setImg_verso(String img_verso) {
		this.img_verso = img_verso;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	
	

}
