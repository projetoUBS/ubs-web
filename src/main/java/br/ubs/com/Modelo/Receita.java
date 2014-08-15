package br.ubs.com.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Receita {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	@Temporal(TemporalType.DATE)
	@Column(nullable=false, name="DT_VALIDADE")
	private Date dtValidade;
	 
	@ManyToOne
	@JoinColumn(name="id_farmaceutico")
	private Farmaceutico farmaceutico;
	 
	@ManyToOne
	@JoinColumn(name="id_enfermeiro")
	private Enfermeiro enfermeiro;

	@OneToMany(mappedBy = "Receita")
	private List <MedicamentoReceita> medicamentoReceita;
	 
	@ManyToOne
	@JoinColumn(name="id_agenda")
	private Agenda agenda;

	@ManyToOne
	@JoinColumn(name="id_paciente")
	private Paciente paciente;


	//Getters e Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDtValidade() {
		return dtValidade;
	}

	public void setDtValidade(Date dtValidade) {
		this.dtValidade = dtValidade;
	}

	public Farmaceutico getFarmaceutico() {
		return farmaceutico;
	}

	public void setFarmaceutico(Farmaceutico farmaceutico) {
		this.farmaceutico = farmaceutico;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public List<MedicamentoReceita> getMedicamentoReceita() {
		return medicamentoReceita;
	}

	public void setMedicamentoReceita(List<MedicamentoReceita> medicamentoReceita) {
		this.medicamentoReceita = medicamentoReceita;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
 
}
 
