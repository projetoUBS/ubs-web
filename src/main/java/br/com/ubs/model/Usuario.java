package br.com.ubs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.eclipse.persistence.jpa.jpql.spi.IManagedType;
import org.eclipse.persistence.jpa.jpql.spi.IManagedTypeProvider;
import org.eclipse.persistence.jpa.jpql.spi.IManagedTypeVisitor;
import org.eclipse.persistence.jpa.jpql.spi.IMapping;
import org.eclipse.persistence.jpa.jpql.spi.IQuery;
import org.eclipse.persistence.jpa.jpql.spi.IType;
import org.eclipse.persistence.jpa.jpql.util.iterator.IterableIterator;

@Entity
public class Usuario extends Pessoa {
 
	@Id
	private String codigo;
	private String login;
	
	private String senha;
	
	private char indPaciente;
	 
	private char indFuncionario;
	/* 
	private GrupoUsuario[] grupoUsuario;
	*/
	public void efetuarLogin() {
	 
	}

	
}
 
