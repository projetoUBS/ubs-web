package br.com.ubs.Modelo;

public class Paciente extends Usuario {
 
	private int codigoSUS;
	 
	private String observacoes;
	 
	private int quantFalta;
	 
	private boolean indPNE;
	 
	private StatusVacina StatusVacina;
	 
	private Consulta Consulta;
	 
	private Prontuario[] Prontuario;
	 
	private Descricao Descricao;
	 
	public void bloquearMarcacaoOnline() {
	 
	}
	 
}
 
