package br.com.ubs.servico;

import br.ubs.com.modelo.Variavel;

public class VariavelServico {


	/*
	 * Se a classe n�o necessitar de selects espec�ficos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private VariavelControle controller;

		private static VariavelServico instance = new VariavelServico();

		public static VariavelServico getInstance() {
			return instance;
		}

		public VariavelServico() {
			controller = new VariavelControle();
		}

		/* M�todos
		 * Falta gerar pkg controle e implementar os m�todos aqui
		 */

		public void cadastrarVariavel(Variavel variavel)
				throws Exception {
			controller.create(variavel);
		}

		public void editarVariavel(Variavel variavel)
				throws Exception {
			controller.edit(variavel);
		}

		public void excluirVariavel(Variavel variavel)
				throws Exception {
			controller.destroy(variavel);
		}

		public void findVariavelById(Integer id) throws Exception {
			controller.recuperarPeloID(Variavel.class, id);
		}

		public void listarAllVariavel() throws Exception {
			controller.list(Variavel.class);
		}

		
}
