package br.ubs.com.modelo;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({
		@NamedQuery(name = "Agenda.listaMedicoData", query = "SELECT a FROM Agenda a WHERE a.medico = :idMedico and a.data = :data ORDER BY a.data, a.hora"),
		@NamedQuery(name = "Agenda.findByMedicoDataHora", query = "SELECT a FROM Agenda a WHERE a.medico = :idMedico and a.data = :data and a.hora = :hora") })
public class Agenda {

	// Atributos de Classe
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Calendar data;

	@Temporal(TemporalType.TIME)
	@Column(nullable = false)
	private Calendar hora_Inicio;

	@Temporal(TemporalType.TIME)
	@Column(nullable = false)
	private Calendar hora_Fim;

	@Column(nullable = false)
	private short status;

	@Column(nullable = false)
	private short tag_Online;

	@Column(nullable = true)
	private String just_Cancelamento;

	@Column(nullable = true)
	private String just_Exclusao;

	@ManyToOne
	@JoinColumn(name = "ID_ATENDENTE")
	private Atendente atendente;

	@ManyToOne
	@JoinColumn(name = "ID_PACIENTE")
	private Paciente paciente;

	@ManyToOne
	@JoinColumn(name = "ID_MEDICO")
	private Medico medico;

	@ManyToOne
	@JoinColumn(name = "ID_UBS")
	private UBS ubs;

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "Agenda")
	private List<Receita> receita;

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "Agenda")
	private List<Exame> exame;

	
	// Getters e Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Calendar getHora_Inicio() {
		return hora_Inicio;
	}

	public void setHora_Inicio(Calendar hora_Inicio) {
		this.hora_Inicio = hora_Inicio;
	}

	public Calendar getHora_Fim() {
		return hora_Fim;
	}

	public void setHora_Fim(Calendar hora_Fim) {
		this.hora_Fim = hora_Fim;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public short getTag_Online() {
		return tag_Online;
	}

	public void setTag_Online(short tag_Online) {
		this.tag_Online = tag_Online;
	}

	public String getJust_Cancelamento() {
		return just_Cancelamento;
	}

	public void setJust_Cancelamento(String just_Cancelamento) {
		this.just_Cancelamento = just_Cancelamento;
	}

	public String getJust_Exclusao() {
		return just_Exclusao;
	}

	public void setJust_Exclusao(String just_Exclusao) {
		this.just_Exclusao = just_Exclusao;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public UBS getUbs() {
		return ubs;
	}

	public void setUbs(UBS ubs) {
		this.ubs = ubs;
	}

	public List<Receita> getReceita() {
		return receita;
	}

	public void setReceita(List<Receita> receita) {
		this.receita = receita;
	}

	public List<Exame> getExame() {
		return exame;
	}

	public void setExame(List<Exame> exame) {
		this.exame = exame;
	}


	// Métodos específicos

}