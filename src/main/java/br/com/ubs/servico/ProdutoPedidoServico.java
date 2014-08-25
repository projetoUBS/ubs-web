package br.com.ubs.servico;

import br.ubs.com.modelo.ProdutoPedido;

public class ProdutoPedidoServico {

	/*
	 * Se a classe não necessitar de selects específicos, declarar :
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

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
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
