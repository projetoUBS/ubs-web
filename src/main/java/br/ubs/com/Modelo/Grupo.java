package br.ubs.com.Modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Grupo {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private int codigoTuss;
	
	@Column(nullable=false)
	private int nome;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Grupo")
	private List <Procedimento> procedimento;
	 
	public void inserirGrupo() {
	 
	}
	 
	public void alterarGrupo() {
	 
	}
	 
	public void consultarGrupo() {
	 
	}
	 
	public void excluirGrupo() {
	 
	}
	 
}
 
