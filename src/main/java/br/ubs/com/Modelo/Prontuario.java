package br.ubs.com.modelo;

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

	
	//Getters e Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Date getDtInicioTratamento() {
		return dtInicioTratamento;
	}

	public void setDtInicioTratamento(Date dtInicioTratamento) {
		this.dtInicioTratamento = dtInicioTratamento;
	}

	public Date getDtFimTratamento() {
		return dtFimTratamento;
	}

	public void setDtFimTratamento(Date dtFimTratamento) {
		this.dtFimTratamento = dtFimTratamento;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Descricao> getDescricao() {
		return descricao;
	}

	public void setDescricao(List<Descricao> descricao) {
		this.descricao = descricao;
	}
	 
}
 
