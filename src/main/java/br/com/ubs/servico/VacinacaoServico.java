package br.com.ubs.servico;

import br.ubs.com.modelo.Vacinacao;

public class VacinacaoServico {

	/*
	 * Se a classe n�o necessitar de selects espec�ficos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private VacinacaoControle controller;

		private static VacinacaoServico instance = new VacinacaoServico();

		public static VacinacaoServico getInstance() {
			return instance;
		}

		public VacinacaoServico() {
			controller = new VacinacaoControle();
		}

		/* M�todos
		 * Falta gerar pkg controle e implementar os m�todos aqui
		 */

		public void cadastrarVacinacao(Vacinacao vacinacao)
				throws Exception {
			controller.create(vacinacao);
		}

		public void editarVacinacao(Vacinacao vacinacao)
				throws Exception {
			controller.edit(vacinacao);
		}

		public void excluirVacinacao(Vacinacao vacinacao)
				throws Exception {
			controller.destroy(vacinacao);
		}

		public void findVacinacaoById(Integer id) throws Exception {
			controller.recuperarPeloID(Vacinacao.class, id);
		}

		public void listarAllVacinacao() throws Exception {
			controller.list(Vacinacao.class);
		}

}
