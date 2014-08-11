package br.ubs.com.Modelo;

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
	 
	public void inserirItem() {
	 
	}
	 
	public void alterarItem() {
	 
	}
	 
	public void excluirPedido() {
	 
	}
	 
	public void consultarItem() {
	 
	}
	 
}
 
