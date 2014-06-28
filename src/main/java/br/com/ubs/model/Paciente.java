package br.com.ubs.model;

public class Paciente extends Usuario {
 
	private int codigoSUS;
	 
	private String observacoes;
	 
	private int quantFalta;
	 
	private boolean indPne;
	 
	private StatusVacina statusVacina;
	 
	private Consulta consulta;
	 
	private Prontuario[] prontuario;
	 
	private Descricao descricao;
	 
	public void bloquearMarcacaoOnline() {
	 
	}
	 
}
 
