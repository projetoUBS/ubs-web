package br.com.ubs.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Especialidade implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	 
	@Column (length = 60)
	private String nome;
	 
	@ManyToMany(mappedBy="Especialidade")
	private List<Medico> medico;
	 
	
	public Especialidade(int codigo, String nome, List<Medico> medico) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.medico = medico;
	}

	public void incluirEspecialidade() {
	 
	}
	 
	public void alterarEspecialidade() {
	 
	}
	 
	public void excluirEspecialidade() {
	 
	}
	 
	public void consultarEspecialidade() {
	 
	}
	 
}
 
