package br.com.ubs.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PessoaBean {
	
	// Validar se determinada pessoa � do tipo Paciente
	public boolean existePaciente(boolean cod_pessoa) {
		
		//provis�rio
		return cod_pessoa;
		
	}
	
	// Validar se determinada pessoa � do tipo Funcion�rio
	public boolean existeFunc(boolean cod_pessoa) {
		
		//provis�rio
		return cod_pessoa;
		
	}

}
