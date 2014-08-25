package br.com.ubs.servico;

import br.ubs.com.modelo.Estoque;

public class EstoqueServico {

	/*
	 * Se a classe n�o necessitar de selects espec�ficos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private EstoqueControle controller;

		private static EstoqueServico instance = new EstoqueServico();

		public static EstoqueServico getInstance() {
			return instance;
		}

		public EstoqueServico() {
			controller = new EstoqueControle();
		}

		/* M�todos
		 * Falta gerar pkg controle e implementar os m�todos aqui
		 */

		public void cadastrarEstoque(Estoque estoque)
				throws Exception {
			controller.create(estoque);
		}

		public void editarEstoque(Estoque estoque)
				throws Exception {
			controller.edit(estoque);
		}

		public void excluirEstoque(Estoque estoque)
				throws Exception {
			controller.destroy(estoque);
		}

		public void findUBSById(Integer id) throws Exception {
			controller.recuperarPeloID(Estoque.class, id);
		}

		public void listarAllEstoque() throws Exception {
			controller.list(Estoque.class);
		}
}
