package br.com.ubs.servico;

import br.ubs.com.modelo.Pedido;

public class PedidoServico {
	
	/*
	 * Se a classe não necessitar de selects específicos, declarar :
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

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
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
