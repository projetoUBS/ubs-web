package br.com.ubs.servico;

import br.ubs.com.modelo.ProdutoPedido;

public class ProdutoPedidoServico {

	/*
	 * Se a classe n�o necessitar de selects espec�ficos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private ProdutoPedidoControle controller;

		private static ProdutoPedidoServico instance = new ProdutoPedidoServico();

		public static ProdutoPedidoServico getInstance() {
			return instance;
		}

		public ProdutoPedidoServico() {
			controller = new ProdutoPedidoControle();
		}

		/* M�todos
		 * Falta gerar pkg controle e implementar os m�todos aqui
		 */

		public void cadastrarProdPedido(ProdutoPedido prodPedido)
				throws Exception {
			controller.create(prodPedido);
		}

		public void editarProdPedido(ProdutoPedido prodPedido)
				throws Exception {
			controller.edit(prodPedido);
		}

		public void excluirProdPedido(ProdutoPedido prodPedido)
				throws Exception {
			controller.destroy(prodPedido);
		}

		public void findProdPedidoById(Integer id) throws Exception {
			controller.recuperarPeloID(ProdutoPedido.class, id);
		}

		public void listarAllProdPedido() throws Exception {
			controller.list(ProdutoPedido.class);
		}
}
