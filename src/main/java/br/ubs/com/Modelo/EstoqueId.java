package br.ubs.com.modelo;

import java.io.Serializable;

public class EstoqueId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//Variáveis com mesmo nome da relação ManyToOne presente na classe MedicamentoReceita
	private int ubs;
	private int produto;
	
	
	public int getubs() {
		return ubs;
	}

	public void setubs(int ubs) {
		this.ubs = ubs;
	}
	
	public int getEstoque() {
		return produto;
	}

	public void setEstoque(int Estoque) {
		this.produto = produto;
	}
	
	@Override
	public int hashCode() {
		return produto + ubs;
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof EstoqueId){
			EstoqueId estoqueId = (EstoqueId) obj;
			return estoqueId.ubs == ubs && estoqueId.produto == produto;
		}
		return false;
	}
}