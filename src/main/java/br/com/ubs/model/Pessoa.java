package br.com.ubs.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/*@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)*/
@MappedSuperclass
public abstract class Pessoa{
 
	/*@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)*/
	@Basic
	private int codigo;
	 
	@Column
	private String cpf;
	/* 
	private String rg;
	 
	private String nome;
	 
	private Date dtNascimento;
	 
	private String logradouro;
	 
	private String cidade;
	 
	private String bairro;
	 
	private String uf;
	 
	private String cep;
	 
	private String telefone;
	*/
	public void addPessoa() {
	 
	}
	 
	public void alterarPessoa() {
	 
	}
	 
	public void excluirPessoa() {
	 
	}
	 
	public void consultarPessoa() {
	 
	}
	 
}
 
