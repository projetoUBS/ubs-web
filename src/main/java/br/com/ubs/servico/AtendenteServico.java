package br.com.ubs.servico;

import br.ubs.com.modelo.AnalistaClinico;

public class AtendenteServico {


	// private AtndenteControle controller;

		private static AtendenteServico instance = new AtendenteServico();

		public static AtendenteServico getInstance() {
			return instance;
		}

		public AtendenteServico() {
			controller = new AtendenteServico();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarAtendente(Atendente atendente)
				throws Exception {
			controller.create(atendente);
		}

		public void editarAtendente(Atendente atendente)
				throws Exception {
			controller.edit(atendente);
		}

		public void excluirAtendente(Atendente atendente)
				throws Exception {
			controller.destroy(atendente);
		}

		public void findUBSById(Integer id) throws Exception {
			controller.recuperarPeloID(Atendente.class, id);
		}

		public void listarAllAtendente() throws Exception {
			controller.list(Atendente.class);
		}
}
