package br.ubs.com.Modelo;

import java.io.Serializable;

public class MedicamentoReceitaId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//Variáveis com mesmo nome da relação ManyToOne presente na classe MedicamentoReceita
	private int medicamento;
	private int receita;
	
	
	public int getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(int medicamento) {
		this.medicamento = medicamento;
	}

	public int getReceita() {
		return receita;
	}

	public void setReceita(int receita) {
		this.receita = receita;
	}

	@Override
	public int hashCode() {
		return medicamento + receita;
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof MedicamentoReceitaId){
			MedicamentoReceitaId medicamentoReceitaId = (MedicamentoReceitaId) obj;
			return medicamentoReceitaId.medicamento == medicamento && medicamentoReceitaId.receita == receita;
		}
		return false;
	}
}
