package br.ubs.com.Modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Paciente extends Pessoa {
 
	@Column(nullable=false)
	private int codigoSUS;
	 
	@Column(nullable=true, length=60)
	private String observacoes;
	 
	@Column(nullable=true)
	private short quantFalta;
	 
	@Column(nullable=true)
	private boolean indPNE;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Paciente")
	private List <Agenda> agenda;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Paciente")
	private List <Vacinacao> vacinacao;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Paciente")
	private List <Prontuario> prontuario;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Paciente")
	private List <Receita> receita;
	 
	public void bloquearMarcacaoOnline() {
	 
	}
	 
}
 
