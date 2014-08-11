package br.ubs.com.Modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Especialidade {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=30, nullable=false)
	private String nome;

	@ManyToMany(mappedBy="Especialidade")
	private List <Medico> medico;
		
	 
	public void incluirEspecialidade() {
	 
	}
	 
	public void alterarEspecialidade() {
	 
	}
	 
	public void excluirEspecialidade() {
	 
	}
	 
	public void consultarEspecialidade() {
	 
	}
	 
}
 
