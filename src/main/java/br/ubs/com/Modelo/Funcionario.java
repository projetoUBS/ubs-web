package br.ubs.com.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Funcionario extends Pessoa {
 
	@Column(nullable=false)
	private int codCBO;
	 
	@Column(nullable=false)
	private short tipoFuncionario;
	 
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "Funcionario")
	private List <Pedido> pedido;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "funcionario_ubs",
	joinColumns = {@JoinColumn (name = "id_funcionario")},
	inverseJoinColumns = {@JoinColumn (name = "id_ubs")})
	private List <UBS> ubs;

	
	//Getters e Setters
	
	public int getCodCBO() {
		return codCBO;
	}

	public void setCodCBO(int codCBO) {
		this.codCBO = codCBO;
	}

	public short getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(short tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public List<UBS> getUbs() {
		return ubs;
	}

	public void setUbs(List<UBS> ubs) {
		this.ubs = ubs;
	}
}
 
