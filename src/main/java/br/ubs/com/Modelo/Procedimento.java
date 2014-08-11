package br.ubs.com.Modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Procedimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable=false,length=50)
	private String nome;
	 
	@Column(nullable=false)
	private int codTUSS;
	 
	@Column(nullable=false)
	private int codAMB;
	 
	@Column(nullable=false)
	private int valorReferencia;

	@ManyToMany(mappedBy="Procedimento")
	private List<Exame> exame;
	
	@OneToMany(mappedBy = "Procedimento")
	private List <Resultado> resultado;
	 
	@ManyToOne
	@JoinColumn(name="id_grupo")
	private Grupo grupo;
	 
}
 
