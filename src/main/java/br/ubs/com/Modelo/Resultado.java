package br.ubs.com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ResultadoId.class)
public class Resultado {
 
	@Id
	@ManyToOne
	@JoinColumn(name = "id_variavel")
	private Variavel variavel;
	 
	@Id
	@ManyToOne
	@JoinColumn(name = "id_procedimento")
	private Procedimento procedimento;
	 
	@ManyToOne
	@JoinColumn(name="id_exame")
	private Exame exame;
	 
	@ManyToOne
	@JoinColumn(name="id_analistaClinico")
	private AnalistaClinico analistaClinico;
	 
	@Column(nullable=true)
	private String resultado;

	
	//Getters e Setters
	
	public Variavel getVariavel() {
		return variavel;
	}

	public void setVariavel(Variavel variavel) {
		this.variavel = variavel;
	}

	public Procedimento getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(Procedimento procedimento) {
		this.procedimento = procedimento;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public AnalistaClinico getAnalistaClinico() {
		return analistaClinico;
	}

	public void setAnalistaClinico(AnalistaClinico analistaClinico) {
		this.analistaClinico = analistaClinico;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
 
