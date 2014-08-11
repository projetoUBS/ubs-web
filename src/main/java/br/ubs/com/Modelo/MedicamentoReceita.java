package br.ubs.com.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(MedicamentoReceitaId.class)
public class MedicamentoReceita {
 
	@Column(nullable=false)
	private short status;
	 
	@Column(nullable=true)
	private short tipoAtendimento;

	@Id
	@ManyToOne
	@JoinColumn(name = "id_receita")
	private Receita receita;
	 
	@Id
	@ManyToOne
	@JoinColumn(name = "id_medicamento")
	private Medicamento medicamento;
	 
}
 
