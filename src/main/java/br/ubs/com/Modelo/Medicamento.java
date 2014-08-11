package br.ubs.com.Modelo;

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
	 
}
 
