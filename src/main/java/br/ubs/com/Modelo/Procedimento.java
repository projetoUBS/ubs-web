package br.ubs.com.modelo;

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

	public int getCodTUSS() {
		return codTUSS;
	}

	public void setCodTUSS(int codTUSS) {
		this.codTUSS = codTUSS;
	}

	public int getCodAMB() {
		return codAMB;
	}

	public void setCodAMB(int codAMB) {
		this.codAMB = codAMB;
	}

	public int getValorReferencia() {
		return valorReferencia;
	}

	public void setValorReferencia(int valorReferencia) {
		this.valorReferencia = valorReferencia;
	}

	public List<Exame> getExame() {
		return exame;
	}

	public void setExame(List<Exame> exame) {
		this.exame = exame;
	}

	public List<Resultado> getResultado() {
		return resultado;
	}

	public void setResultado(List<Resultado> resultado) {
		this.resultado = resultado;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	 
}
 
