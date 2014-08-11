package br.ubs.com.Modelo;

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
}
 
