package br.com.ubs.servico;

import br.com.ubs.controle.EspecialidadeControle;
import br.ubs.com.modelo.Especialidade;

public class AgendaServico {

	// private AgendaControle controller;

	private static AgendaServico instance = new AgendaServico();

	public static AgendaServico getInstance() {
		return instance;
	}

	public AgendaServico() {
		controller = new AgendaControle();
	}

	/* Métodos
	 * Falta gerar pkg controle e implementar os métodos aqui
	 */

	public void cadastrarAgenda(Agenda agenda)
			throws Exception {
		controller.create(agenda);
	}

	public void editarAgenda(Agenda agenda)
			throws Exception {
		controller.edit(agenda);
	}

	public void excluirAgenda(Agenda agenda)
			throws Exception {
		controller.destroy(agenda);
	}

	public void findUBSById(Integer id) throws Exception {
		controller.recuperarPeloID(Agenda.class, id);
	}

	public void listarAllAgenda() throws Exception {
		controller.list(Agenda.class);
	}
}
