package br.com.ubs.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PessoaBean {
	
	// Validar se determinada pessoa é do tipo Paciente
	public boolean existePaciente(boolean cod_pessoa) {
		
		//provisório
		return cod_pessoa;
		
	}
	
	// Validar se determinada pessoa é do tipo Funcionário
	public boolean existeFunc(boolean cod_pessoa) {
		
		//provisório
		return cod_pessoa;
		
	}

}
