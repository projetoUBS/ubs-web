package br.ubs.com.Modelo;

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
public class Vacina {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	@Column(nullable=false)
	private String nome;
	 
	@Column(nullable=false,name="INTERVALO_DOSE")
	private int intervaloDose;
	 
	@Column(nullable=false,name="QUANT_DOSE")
	private int quantDose;
	 
	@Column(nullable=false)
	private String descricao;
	 
	@Column(nullable=false)
	private Boolean obrigatorio;
	 
	@Column(nullable=false,name="IDADE_PRIMEIRA_DOSE")
	private int idadePrimeiraDose;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Vacina")
	private List <Vacinacao> vacinacao;
	 
	public void incluirVacina() {
	 
	}
	 
	public void alterarVacina() {
	 
	}
	 
	public void excluirVacina() {
	 
	}
	 
	public void consultarVacina() {
	 
	}
	 
}
 
