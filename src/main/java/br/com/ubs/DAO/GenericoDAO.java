package br.com.ubs.DAO;

import java.util.List;

public interface GenericoDAO<E> {

	public E create(E entity) throws Exception;
	
	public E update(E entity) throws Exception;
	
	public void destroy(E entity) throws Exception;
	
	public E recuperarPeloID(Class<E> persistentClass, Integer id) throws Exception;
	
	public List<E> list(Class<E> persistentClass);
	
}
