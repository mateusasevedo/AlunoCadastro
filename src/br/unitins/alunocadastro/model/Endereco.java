package br.unitins.alunocadastro.model;

import javax.validation.constraints.NotBlank;

public class Endereco {
	@NotBlank(message="O cep deve ser informado.")
	private String cep;
	
	@NotBlank(message="A rua deve ser informada.")
	private String rua;
	
	@NotBlank(message="O número deve ser informado.")
	private String numero;
	
	@NotBlank(message="A cidade deve ser informada.")
	private String cidade;
	
	@NotBlank(message="O estado deve ser informado.")
	private String estado;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
