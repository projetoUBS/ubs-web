package br.ubs.com.Modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dtSolicitacao;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date dtEntrega;
	 
	@ManyToOne
	@JoinColumn(name="ID_FUNCIONARIO")
	private Funcionario funcionario;
	 
	@ManyToOne
	@JoinColumn(name="ID_ESTOQUISTA")
	private Estoquista estoquista;
	 
	@OneToMany(mappedBy = "Pedido")
	private List <ProdutoPedido> produtoPedido;
	 
}
 
