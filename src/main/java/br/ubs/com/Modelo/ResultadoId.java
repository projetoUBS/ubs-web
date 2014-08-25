package br.ubs.com.modelo;

import java.io.Serializable;

public class ResultadoId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//Variáveis com mesmo nome da relação ManyToOne presente na classe Resultado
	private int variavel;
	private int procedimento;
	
	public int getVariavel() {
		return variavel;
	}
	
	public void setVariavel(int variavel) {
		this.variavel = variavel;
	}
	
	public int getProcedimento() {
		return procedimento;
	}
	
	public void setProcedimento(int procedimento) {
		this.procedimento = procedimento;
	}

	@Override
	public int hashCode() {
		return variavel+procedimento;
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof ResultadoId){
			ResultadoId resultadoId = (ResultadoId) obj;
			return resultadoId.variavel == variavel && resultadoId.procedimento == procedimento;
		}
		return false;
	}
}
