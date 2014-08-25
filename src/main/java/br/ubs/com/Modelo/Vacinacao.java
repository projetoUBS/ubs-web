package br.ubs.com.modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vacinacao {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private short status;
	 
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false,name="DT_HR_APLICACAO")
	private Calendar dtHrAplicacao;
	 
	@Temporal(TemporalType.DATE)
	@Column(nullable=false,name="PROXIMA_DOSE")
	private Calendar proximaDose;
	
	@ManyToOne
	@JoinColumn(name="ID_ENFERMEIRO")
	private Enfermeiro enfermeiro;
	 
	@ManyToOne
	@JoinColumn(name="ID_PACIENTE")
	private Paciente paciente;
	 
	@ManyToOne
	@JoinColumn(name="ID_VACINA")
	private Vacina vacina;

	
	//Getters e Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public Calendar getDtHrAplicacao() {
		return dtHrAplicacao;
	}

	public void setDtHrAplicacao(Calendar dtHrAplicacao) {
		this.dtHrAplicacao = dtHrAplicacao;
	}

	public Calendar getProximaDose() {
		return proximaDose;
	}

	public void setProximaDose(Calendar proximaDose) {
		this.proximaDose = proximaDose;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	 
}
 
