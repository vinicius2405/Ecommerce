package br.com.loja.ecommerce.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "funcionario")
public class Funcionario {
	
	@Id
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "CARGO")
	private String cargo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_NASC")
	private Date data_nasc;
	
	@Column(name = "SEXO")
	private String sexo;
	
	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "SENHA")
	private String senha;
	
	@Column(name = "ATIVO")
	private int ativo;
	

}
