package br.ubs.com.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Medicamento extends Produto{
 
	@Column(nullable=true)
	private String classificacao;
	
	@OneToMany(mappedBy = "Medicamento")
	private List <MedicamentoReceita> medicamentoReceita;

	
	//Getters e Setters
	
	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public List<MedicamentoReceita> getMedicamentoReceita() {
		return medicamentoReceita;
	}

	public void setMedicamentoReceita(List<MedicamentoReceita> medicamentoReceita) {
		this.medicamentoReceita = medicamentoReceita;
	}
	 
}
 
