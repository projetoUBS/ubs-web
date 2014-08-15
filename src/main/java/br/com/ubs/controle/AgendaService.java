package br.com.ubs.controle;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import br.com.ubs.dao.GenericoDAOJPA;
import br.ubs.com.modelo.Agenda;
import br.ubs.com.modelo.Medico;


public class AgendaService extends GenericoDAOJPA<Agenda> implements Serializable {
	                
	                public List<Agenda> listaUnidadeMedicoData(Medico m, Date data) {
	                               Query query = em.createNamedQuery("Agenda.listaMedicoData");
	                               query.setParameter("idMedico",  m);
	                               query.setParameter("data", data );
	                               return query.getResultList();
	                }            

	                public Agenda findByMedicoDataHora(Medico m, Date data, Date hora) {
	                               Query query = em.createNamedQuery("Agenda.findByMedicoDataHora");
	                               query.setParameter("idMedico",  m);
	                               query.setParameter("data", data );
	                               query.setParameter("hora", hora );
	                               try {
	                                                return (Agenda)query.getSingleResult();
	                               } catch (Exception e) {
	                                               return null;                                        
	                               }

	                               // return em.createNamedQuery("Agenda.findByMedicoDataHora").setParameter("idMedico",  m).setParameter("data", data ).setParameter("hora", hora ).getSingleResult(); 
	                }                            
	       	}
