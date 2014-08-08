package br.com.ubs.Modelo;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) 
public class Funcionario extends Pessoa {
 
	private int codCBO;
	 
	private int tipoFuncionario;
	 
	private Pedido[] pedido;
	 
	private UBS[] uBS;
	 
}
 
