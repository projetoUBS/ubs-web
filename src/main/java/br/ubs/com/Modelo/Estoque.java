package br.ubs.com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(EstoqueId.class)
public class Estoque {
 
	@Column(nullable=false)
	private int quantidadeAtual;
	 
	@Id 
	@ManyToOne
	@JoinColumn(name = "ID_UBS")
	private UBS ubs;
	
	@Id 
	@ManyToOne
	@JoinColumn(name = "ID_PRODUTO")
	private Produto produto;

	
	//Getters e Setters
	
	public int getQuantidadeAtual() {
		return quantidadeAtual;
	}

	public void setQuantidadeAtual(int quantidadeAtual) {
		this.quantidadeAtual = quantidadeAtual;
	}

	public UBS getUbs() {
		return ubs;
	}

	public void setUbs(UBS ubs) {
		this.ubs = ubs;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
 
