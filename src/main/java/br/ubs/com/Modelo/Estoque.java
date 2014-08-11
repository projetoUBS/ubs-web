package br.ubs.com.Modelo;

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
	 
}
 
