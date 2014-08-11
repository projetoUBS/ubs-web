package br.ubs.com.Modelo;

import java.util.Date;
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
public class Prontuario {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	@Column(nullable=true)
	private String diagnostico;
	 
	@Temporal(TemporalType.DATE)
	@Column(nullable=false,name="DT_INICIO_TRATAMENTI")
	private Date dtInicioTratamento;
	 
	@Temporal(TemporalType.DATE)
	@Column(nullable=true,name="DT_FIM_TRATAMENTO")
	private Date dtFimTratamento;

	@ManyToOne
	@JoinColumn(name="ID_PACIENTE")
	private Paciente paciente;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Prontuario")
	private List <Descricao> descricao;
	 
	public void inserirProntuario() {
	 
	}
	 
	public void alterarProntuario() {
	 
	}
	 
	public void consultarProntuario() {
	 
	}
	 
}
 
