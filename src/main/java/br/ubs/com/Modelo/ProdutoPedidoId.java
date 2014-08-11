package br.ubs.com.Modelo;

import java.io.Serializable;

public class ProdutoPedidoId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//Variáveis com mesmo nome da relação ManyToOne presente na classe Resultado
	private int produto;
	private int pedido;
	
	
	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		return produto + pedido;
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof ProdutoPedidoId){
			ProdutoPedidoId produtoPedidoId = (ProdutoPedidoId ) obj;
			return produtoPedidoId.produto == produto && produtoPedidoId.pedido == pedido;
		}
		return false;
	}
}
