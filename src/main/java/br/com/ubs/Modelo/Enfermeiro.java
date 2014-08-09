package br.com.ubs.Modelo;

import javax.persistence.Entity;

@Entity
public class Enfermeiro extends Funcionario {
 
	private int coren;
	 
	private Receita[] receita;
	 
	private Vacinacao[] vacinacao;
	 
}
 
