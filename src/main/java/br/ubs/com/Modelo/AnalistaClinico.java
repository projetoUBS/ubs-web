package br.ubs.com.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class AnalistaClinico extends Funcionario {
 
	@Column (nullable = true)
	private int crf;

	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "AnalistaClinico")
	private List <Resultado> resultado;

	
	//Getters e Setters
	
	public int getCrf() {
		return crf;
	}

	public void setCrf(int crf) {
		this.crf = crf;
	}

	public List<Resultado> getResultado() {
		return resultado;
	}

	public void setResultado(List<Resultado> resultado) {
		this.resultado = resultado;
	}
	 
	
}
 
