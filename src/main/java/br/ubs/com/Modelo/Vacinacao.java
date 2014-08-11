package br.ubs.com.Modelo;

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
	
	public void proximasDoses() {
	 
	}
	 
	public void alertaVacinacao() {
	 
	}
	 
	public void confirmaAplicacao() {
	 
	}
	 
}
 
