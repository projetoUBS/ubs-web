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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Exame {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dtValidade;
	 
	@Column(nullable=false)
	private short status;
	 
	@ManyToOne
	@JoinColumn(name="id_agenda")
	private Agenda agenda;
	 
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "exame_procedimento",
	joinColumns = {@JoinColumn (name = "id_exame")},
	inverseJoinColumns = {@JoinColumn (name = "id_procedimento")})
	private List<Procedimento> procedimento;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Exame")
	private List <Resultado> resultado;

	
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

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public List<Procedimento> getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(List<Procedimento> procedimento) {
		this.procedimento = procedimento;
	}

	public List<Resultado> getResultado() {
		return resultado;
	}

	public void setResultado(List<Resultado> resultado) {
		this.resultado = resultado;
	}
}
 
