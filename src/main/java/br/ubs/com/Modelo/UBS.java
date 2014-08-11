package br.ubs.com.Modelo;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UBS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	@Column(nullable=false)
	private String localidade;
	 
	@Column(nullable=false)
	private String nome;
	 
	@Column(nullable=true)
	private String telefone;
	 
	@Column(nullable=false)
	private String responsavel;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false,name="DT_CADASTRO")
	private Calendar dtCadastro;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false, name="DT_ENCERRAMENTO")
	private Calendar dtEncerramento;
	
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "ubs")		
	private List <Agenda> agenda;
	 
	@ManyToMany(mappedBy="ubs") 
	private List <Funcionario> funcionario;

	@OneToMany(mappedBy = "ubs")	
	private List <Estoque> estoque;
	 
	public void inserirUBS() {
	 
	}
	 
	public void alterarUBS() {
	 
	}
	 
	public void excluirUBS() {
	 
	}
	 
	public void consultarUBS() {
	 
	}
	 
}
 
