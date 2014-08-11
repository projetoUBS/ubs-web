package br.ubs.com.Modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	@Column(nullable=false)
	private String cpf;
	 
	@Column(nullable=false)
	private String rg;
	 
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=true)
	private String celular;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dtNascimento;
	 
	@Column(nullable=false)
	private String logradouro;
	 
	@Column(nullable=false)
	private String cidade;
	 
	@Column(nullable=false)
	private String bairro;
	 
	@Column(nullable=false)
	private String uf;
	 
	@Column(nullable=false)
	private String cep;
	
	@Column(nullable=false)
	private String telefone;
	 
	@Column(nullable=false)
	private String login;
	 
	@Column(nullable=false)
	private String senha;
	 
	@Column(nullable=true)
	private int ind_func;
	 
	@Column(nullable=true)
	private int ind_paciente;
	 
	@Column(nullable=true)
	private int ind_adm;
	 
	public void addPessoa() {
	 
	}
	 
	public void alterarPessoa() {
	 
	}
	 
	public void excluirPessoa() {
	 
	}
	 
	public void consultarPessoa() {
	 
	}
	 
	public void efetuarLogin() {
	 
	}
	
	//Gerar método: AlterarSenha
	 
}
 
