package br.ubs.com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ProdutoPedidoId.class)
public class ProdutoPedido {
 
	@Column(nullable=false)
	private int quantidade;

	@Id
	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;
	 
	@Id
	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private Pedido pedido;

	
	//Getters e Setters
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
		 
}
 
