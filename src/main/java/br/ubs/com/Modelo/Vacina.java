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

	
	//Getters e Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIntervaloDose() {
		return intervaloDose;
	}

	public void setIntervaloDose(int intervaloDose) {
		this.intervaloDose = intervaloDose;
	}

	public int getQuantDose() {
		return quantDose;
	}

	public void setQuantDose(int quantDose) {
		this.quantDose = quantDose;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getObrigatorio() {
		return obrigatorio;
	}

	public void setObrigatorio(Boolean obrigatorio) {
		this.obrigatorio = obrigatorio;
	}

	public int getIdadePrimeiraDose() {
		return idadePrimeiraDose;
	}

	public void setIdadePrimeiraDose(int idadePrimeiraDose) {
		this.idadePrimeiraDose = idadePrimeiraDose;
	}

	public List<Vacinacao> getVacinacao() {
		return vacinacao;
	}

	public void setVacinacao(List<Vacinacao> vacinacao) {
		this.vacinacao = vacinacao;
	}
	 	 
}
 
