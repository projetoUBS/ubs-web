package br.ubs.com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(MedicamentoReceitaId.class)
public class MedicamentoReceita {
 
	@Column(nullable=false)
	private short status;
	 
	@Column(nullable=true)
	private short tipoAtendimento;

	@Id
	@ManyToOne
	@JoinColumn(name = "id_receita")
	private Receita receita;
	 
	@Id
	@ManyToOne
	@JoinColumn(name = "id_medicamento")
	private Medicamento medicamento;

	
	//Getters e Setters
	
	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public short getTipoAtendimento() {
		return tipoAtendimento;
	}

	public void setTipoAtendimento(short tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}

	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	 
}
 
