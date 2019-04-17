package br.unitins.alunocadastro.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.alunocadastro.model.Telefone;
import br.unitins.alunocadastro.model.Aluno;
import br.unitins.alunocadastro.model.Endereco;

@Named
@ViewScoped
public class AlunoController implements Serializable {

	private static final long serialVersionUID = -4841457811284600168L;

	private Aluno aluno;
	
	private Telefone telefone;
	
	private List<Aluno> listaAluno;

	public List<Aluno> getListaAluno() {
		if (listaAluno == null) {
			listaAluno = new ArrayList<Aluno>();
		}
		return listaAluno;
	}

	public Aluno getAluno() {
		if (aluno == null)
			aluno = new Aluno();
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Telefone getTelefone() {
		if (telefone == null)
			telefone = new Telefone();
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public void editar(Aluno aluno) {
		setAluno((Aluno)aluno.getClone());
	}
	
	public void adicionarTelefone() {
		if (getAluno().getListaTelefone() == null) 
			getAluno().setListaTelefone(new ArrayList<Telefone>());
		
		getAluno().getListaTelefone().add(getTelefone());
		setTelefone(null);
	}
	
	public void removerTelefone(Telefone telefone) {
		getAluno().getListaTelefone().remove(telefone);
	}
	
	public void incluir() {
		getListaAluno().add(getAluno());
		limpar();
	}
	
	public void alterar() {			
		// obtendo o indice (posicao da lista)
		int index = getListaAluno().indexOf(getAluno());
		if (index != -1) {
			// alterando a posicao da lista com um novo aluno
			getListaAluno().set(index, getAluno());
			limpar();
		}
			
	}
	
	public void excluir() {
		int index = getListaAluno().indexOf(getAluno());
		getListaAluno().remove(index);
		if (index != -1)
			limpar();
	}
	
	public void limpar() {	
		aluno = null;
		telefone = null;
	}

}
