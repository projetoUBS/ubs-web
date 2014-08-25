package br.com.ubs.controle;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import br.com.ubs.dao.GenericoDAOJPA;
import br.ubs.com.modelo.UBS;

@SuppressWarnings("serial")
public class UBSControle extends GenericoDAOJPA<UBS> implements Serializable {

	 @SuppressWarnings("unchecked")
	public List<UBS> findByLocalidade (String localidade) {

         Query query = em.createNamedQuery("Agenda.listaMedicoData");
         query.setParameter("localidade",  localidade);
         return query.getResultList();
	 }	
}
