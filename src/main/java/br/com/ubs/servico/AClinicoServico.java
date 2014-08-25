package br.com.ubs.servico;

import br.ubs.com.modelo.Agenda;
import br.ubs.com.modelo.AnalistaClinico;

public class AClinicoServico {

	// private AClinicoControle controller;

		private static AClinicoServico instance = new AClinicoServico();

		public static AClinicoServico getInstance() {
			return instance;
		}

		public AClinicoServico() {
			controller = new AClinicoServico();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarAnalistaClinico(AnalistaClinico analista)
				throws Exception {
			controller.create(analista);
		}

		public void editarAnalistaClinico(AnalistaClinico analista)
				throws Exception {
			controller.edit(analista);
		}

		public void excluirAnalistaClinico(AnalistaClinico analista)
				throws Exception {
			controller.destroy(analista);
		}

		public void findUBSById(Integer id) throws Exception {
			controller.recuperarPeloID(AnalistaClinico.class, id);
		}

		public void listarAllAnalistaClinico() throws Exception {
			controller.list(AnalistaClinico.class);
		}
}
