package br.ubs.com.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Grupo {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private int codigoTuss;
	
	@Column(nullable=false)
	private int nome;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Grupo")
	private List <Procedimento> procedimento;

	
	//Getters e Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigoTuss() {
		return codigoTuss;
	}

	public void setCodigoTuss(int codigoTuss) {
		this.codigoTuss = codigoTuss;
	}

	public int getNome() {
		return nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
	}

	public List<Procedimento> getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(List<Procedimento> procedimento) {
		this.procedimento = procedimento;
	}
	 	 
}
 
