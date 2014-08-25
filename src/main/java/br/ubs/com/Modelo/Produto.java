package br.ubs.com.modelo;

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

	public Date getDtValidade() {
		return dtValidade;
	}

	public void setDtValidade(Date dtValidade) {
		this.dtValidade = dtValidade;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public int getQuantMin() {
		return quantMin;
	}

	public void setQuantMin(int quantMin) {
		this.quantMin = quantMin;
	}

	public boolean isTipoMedicamento() {
		return tipoMedicamento;
	}

	public void setTipoMedicamento(boolean tipoMedicamento) {
		this.tipoMedicamento = tipoMedicamento;
	}

	public List<ProdutoPedido> getProdutoPedido() {
		return produtoPedido;
	}

	public void setProdutoPedido(List<ProdutoPedido> produtoPedido) {
		this.produtoPedido = produtoPedido;
	}

	public List<Estoque> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Estoque> estoque) {
		this.estoque = estoque;
	}
	 
}
 
