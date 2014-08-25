package br.com.ubs.servico;

import br.ubs.com.modelo.Produto;


public class ProdutoServico {

	/*
	 * Se a classe não necessitar de selects específicos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private ProdutoControle controller;

		private static ProdutoServico instance = new ProdutoServico();

		public static ProdutoServico getInstance() {
			return instance;
		}

		public ProdutoServico() {
			controller = new ProdutoControle();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarProduto(Produto produto)
				throws Exception {
			controller.create(produto);
		}

		public void editarProduto(Produto produto)
				throws Exception {
			controller.edit(produto);
		}

		public void excluirProduto(Produto produto)
				throws Exception {
			controller.destroy(produto);
		}

		public void findProdutoById(Integer id) throws Exception {
			controller.recuperarPeloID(Produto.class, id);
		}

		public void listarAllProduto() throws Exception {
			controller.list(Produto.class);
		}
		
}
