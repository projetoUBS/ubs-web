package br.com.ubs.servico;

import br.ubs.com.modelo.Pedido;

public class PedidoServico {
	
	/*
	 * Se a classe n�o necessitar de selects espec�ficos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private PedidoControle controller;

		private static PedidoServico instance = new PedidoServico();

		public static PedidoServico getInstance() {
			return instance;
		}

		public PedidoServico() {
			controller = new PedidoControle();
		}

		/* M�todos
		 * Falta gerar pkg controle e implementar os m�todos aqui
		 */

		public void cadastrarPedido(Pedido pedido)
				throws Exception {
			controller.create(pedido);
		}

		public void editarPedido(Pedido pedido)
				throws Exception {
			controller.edit(pedido);
		}

		public void excluirPedido(Pedido pedido)
				throws Exception {
			controller.destroy(pedido);
		}

		public void findPedidoById(Integer id) throws Exception {
			controller.recuperarPeloID(Pedido.class, id);
		}

		public void listarAllPedido() throws Exception {
			controller.list(Pedido.class);
		}

}
