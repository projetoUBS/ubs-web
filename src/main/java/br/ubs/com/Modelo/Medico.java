package br.ubs.com.Modelo;

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
	 
}
 
