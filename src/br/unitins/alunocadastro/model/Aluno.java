package br.unitins.alunocadastro.model;

import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

public class Aluno extends DefaultEntity{

	private String nome;
	@CPF(message="CPF inválido")
	private String cpf;
	private List<Telefone> listaTelefone;
	private Endereco endereco;

	public Aluno() {
		
	}
	public Aluno(Integer id, String nome, String cpf, Endereco endereco) {
		super();
		setId(id);
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Telefone> getListaTelefone() {
		return listaTelefone;
	}

	public void setListaTelefone(List<Telefone> listaTelefone) {
		this.listaTelefone = listaTelefone;
	}

	public Endereco getEndereco() {
		if (endereco == null)
			endereco = new Endereco();
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
