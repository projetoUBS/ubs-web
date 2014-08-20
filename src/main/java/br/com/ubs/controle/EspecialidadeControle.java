package br.com.ubs.controle;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import br.com.ubs.dao.GenericoDAOJPA;
import br.ubs.com.modelo.Especialidade;

public class EspecialidadeControle extends GenericoDAOJPA<Especialidade> implements Serializable {

		 public List<Especialidade> findByNome(String nome) {

	         Query query = em.createNamedQuery("Especialidade.findByName");

	         query.setParameter("nome", nome);

	         return query.getResultList();
		 }
}
