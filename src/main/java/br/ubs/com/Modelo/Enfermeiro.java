package br.ubs.com.Modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Enfermeiro extends Funcionario {
 
	@Column(nullable=true)
	private int coren;

	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Enfermeiro")	
	private List <Receita> receita;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Enfermeiro")
	private List <Vacinacao> vacinacao;
	 
}
 
