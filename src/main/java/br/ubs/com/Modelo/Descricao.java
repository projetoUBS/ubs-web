package br.ubs.com.Modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Descricao {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Calendar data;
	
	@Temporal(TemporalType.TIME)
	@Column(nullable=false)
	private Calendar hora;
	 
	@Column (length = 60, nullable = false)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="ID_PRONTUARIO")
	private Prontuario prontuario;
	 
	public void inserirDescricao() {
	 
	}
	 
	public void alterarDescricao() {
	 
	}
	 
	public void consultarDescricao() {
	 
	}
	 
}
 
