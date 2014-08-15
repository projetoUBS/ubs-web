package br.ubs.com.modelo;

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

	
	//Getters e Setters
	
	public int getCodigoSUS() {
		return codigoSUS;
	}

	public void setCodigoSUS(int codigoSUS) {
		this.codigoSUS = codigoSUS;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public short getQuantFalta() {
		return quantFalta;
	}

	public void setQuantFalta(short quantFalta) {
		this.quantFalta = quantFalta;
	}

	public boolean isIndPNE() {
		return indPNE;
	}

	public void setIndPNE(boolean indPNE) {
		this.indPNE = indPNE;
	}

	public List<Agenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Agenda> agenda) {
		this.agenda = agenda;
	}

	public List<Vacinacao> getVacinacao() {
		return vacinacao;
	}

	public void setVacinacao(List<Vacinacao> vacinacao) {
		this.vacinacao = vacinacao;
	}

	public List<Prontuario> getProntuario() {
		return prontuario;
	}

	public void setProntuario(List<Prontuario> prontuario) {
		this.prontuario = prontuario;
	}

	public List<Receita> getReceita() {
		return receita;
	}

	public void setReceita(List<Receita> receita) {
		this.receita = receita;
	}
	 
}
 
