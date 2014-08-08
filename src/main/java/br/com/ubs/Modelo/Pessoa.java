package br.com.ubs.Modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	 
	private String cpf;
	 
	private String rg;
	 
	private String nome;
	 
	private Date dtNascimento;
	 
	private String logradouro;
	 
	private String cidade;
	 
	private String bairro;
	 
	private String uf;
	 
	private String cep;
	 
	private String telefone;
	 
	private String login;
	 
	private String senha;
	 
	private int ind_func;
	 
	private int ind_paciente;
	 
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
	 
}
 
