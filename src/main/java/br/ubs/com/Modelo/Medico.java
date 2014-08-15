package br.ubs.com.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Medico extends Funcionario {
 
	@Column(nullable=true)
	private int crm;
	 
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "medico_especialidade",
	joinColumns = {@JoinColumn (name = "id_medico")},
	inverseJoinColumns = {@JoinColumn (name = "id_especialidade")})
	private List <Especialidade> especialidade;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Medico")
	private List<Agenda> agenda;

	
	//Getters e Setters
	
	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public List<Especialidade> getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(List<Especialidade> especialidade) {
		this.especialidade = especialidade;
	}

	public List<Agenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Agenda> agenda) {
		this.agenda = agenda;
	}
	 
}
 
