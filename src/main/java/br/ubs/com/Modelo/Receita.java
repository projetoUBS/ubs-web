package br.ubs.com.Modelo;

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
	 
	public void inserirReceita() {
	 
	}
	 
	public void alterarReceita() {
	 
	}
	 
	public void consultarReceita() {
	 
	}
	 
	public void associarMedicamento() {
	 
	}
	 
	public void entregarMedicamento() {
	 
	}
	 
}
 
