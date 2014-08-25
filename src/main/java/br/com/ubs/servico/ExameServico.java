package br.com.ubs.servico;

import br.ubs.com.modelo.Estoque;
import br.ubs.com.modelo.Exame;

public class ExameServico {
	
	/*
	 * Se a classe n�o necessitar de selects espec�ficos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private ExameControle controller;

		private static ExameServico instance = new ExameServico ();

		public static ExameServico getInstance() {
			return instance;
		}

		public ExameServico() {
			controller = new ExameControle();
		}

		/* M�todos
		 * Falta gerar pkg controle e implementar os m�todos aqui
		 */

		public void cadastrarExame(Exame exame)
				throws Exception {
			controller.create(exame);
		}

		public void editarExame(Exame exame)
				throws Exception {
			controller.edit(exame);
		}

		public void excluirExame(Exame exame)
				throws Exception {
			controller.destroy(exame);
		}

		public void findUBSById(Integer id) throws Exception {
			controller.recuperarPeloID(Exame.class, id);
		}

		public void listarAllExame() throws Exception {
			controller.list(Exame.class);
		}

}
