package br.com.ubs.servico;

import br.ubs.com.modelo.Prontuario;

public class ProntuarioServico {

	/*
	 * Se a classe não necessitar de selects específicos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private ProntuarioControle controller;

		private static ProntuarioServico instance = new ProntuarioServico();

		public static ProntuarioServico getInstance() {
			return instance;
		}

		public ProntuarioServico() {
			controller = new ProntuarioControle();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarProntuario(Prontuario pront)
				throws Exception {
			controller.create(pront);
		}

		public void editarProntuario(Prontuario pront)
				throws Exception {
			controller.edit(pront);
		}

		public void excluirProntuario(Prontuario pront)
				throws Exception {
			controller.destroy(pront);
		}

		public void findProntuarioById(Integer id) throws Exception {
			controller.recuperarPeloID(Prontuario.class, id);
		}

		public void listarAllProntuario() throws Exception {
			controller.list(Prontuario.class);
		}
}
