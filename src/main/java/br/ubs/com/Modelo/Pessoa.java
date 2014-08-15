package br.ubs.com.modelo;

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

	
	//Getters e Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getInd_func() {
		return ind_func;
	}

	public void setInd_func(int ind_func) {
		this.ind_func = ind_func;
	}

	public int getInd_paciente() {
		return ind_paciente;
	}

	public void setInd_paciente(int ind_paciente) {
		this.ind_paciente = ind_paciente;
	}

	public int getInd_adm() {
		return ind_adm;
	}

	public void setInd_adm(int ind_adm) {
		this.ind_adm = ind_adm;
	}
	 	 
}
 
