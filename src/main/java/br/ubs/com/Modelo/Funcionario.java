package br.ubs.com.Modelo;

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
	 
}
 
