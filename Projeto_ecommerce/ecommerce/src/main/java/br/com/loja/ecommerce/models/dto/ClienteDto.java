package br.com.loja.ecommerce.models.dto;

public class ClienteDto {

	private String cpf;
	private String nome;
	private String data_nasc;
	private String senha;
	
	public ClienteDto() {}

	public ClienteDto(String cpf, String nome, String data_nasc, String senha) {
		this.setCpf(cpf);
		this.setNome(nome);
		this.setData_nasc(data_nasc);
		this.setSenha(senha);
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
