package br.ubs.com.Modelo;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Agenda {
 
	//Atributos de Classe
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	@Temporal(TemporalType.DATE)
	@Column (nullable = false)
	private Calendar data;
	
	@Temporal(TemporalType.TIME)
	@Column (nullable = false)
	private Calendar hora_Inicio;
	
	@Temporal(TemporalType.TIME)
	@Column (nullable = false)
	private Calendar hora_Fim;
	 
	@Column (nullable = false)
	private short status;
	 
	@Column (nullable = false)
	private short tag_Online;
	 
	@Column (nullable = true)
	private String just_Cancelamento;
	 
	@Column (nullable = true)
	private String just_Exclusao;
	 
	@ManyToOne
	@JoinColumn(name="ID_ATENDENTE")
	private Atendente atendente;
	 
	@ManyToOne
	@JoinColumn(name="ID_PACIENTE")
	private Paciente paciente;
	 
	@ManyToOne
	@JoinColumn(name="ID_MEDICO")
	private Medico medico;
	
	@ManyToOne
	@JoinColumn(name="ID_UBS")
	private UBS ubs;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Agenda")
	private List <Receita> receita;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Agenda")
	private List <Exame> exame;
	
	
	//Getters e Setters
	
	
	
	//Métodos específicos
	public void inserirAgenda() {
	 
	}
	 
	public void alterarAgenda() {
	 
	}
	 
	public void consultarAgenda() {
	 
	}
	 
	public void excluirAgenda() {
	 
	}
	 
	public void bloquearAgenda() {
	 
	}
	 
	public void agendarConsulta() {
	 
	}
	 
	public void AlterarConsulta() {
	 
	}
	 
	public void excluirConsulta() {
	 
	}
	 
	public void pesquisarConsulta() {
	 
	}
	 
}
 
