package br.ubs.com.Modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Produto {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	@Column(nullable=false, length=30)
	private String nome;
	 
	@Temporal(TemporalType.DATE) 
	@Column(nullable=false)
	private Date dtValidade;
	 
	@Column(nullable=false)
	private String unidadeMedida;
	
	@Column(nullable=false)
	private int quantMin;
	 
	@Column(nullable=true)
	private boolean tipoMedicamento;
	 
	@OneToMany(mappedBy = "Produto") 
	private List <ProdutoPedido> produtoPedido;
	 
	@OneToMany(mappedBy = "Produto")  
	private List <Estoque> estoque;
	 
	public void inserirProduto() {
	 
	}
	 
	public void alterarPoduto() {
	 
	}
	 
	public void excluirProduto() {
	 
	}
	 
	public void consultarProduto() {
	 
	}
	 
}
 
