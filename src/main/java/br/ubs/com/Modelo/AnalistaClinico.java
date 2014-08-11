package br.ubs.com.Modelo;

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
	 
}
 
