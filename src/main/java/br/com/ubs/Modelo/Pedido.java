package br.com.ubs.Modelo;

import java.util.Date;

public class Pedido {
 
	private int id;
	 
	private Date dtSolicitacao;
	 
	private Date dtEntrega;
	 
	private Funcionario funcionario;
	 
	private Estoquista estoquista;
	 
	private ProdutoPedido[] produtoPedido;
	 
}
 
