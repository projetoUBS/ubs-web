package br.com.ubs.servico;

import br.ubs.com.modelo.Funcionario;

public class FuncionarioServico {

	/*
	 * Se a classe n�o necessitar de selects espec�ficos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private FuncionarioControle controller;

		private static FuncionarioServico instance = new FuncionarioServico();

		public static FuncionarioServico getInstance() {
			return instance;
		}

		public FuncionarioServico() {
			controller = new FuncionarioControle();
		}

		/* M�todos
		 * Falta gerar pkg controle e implementar os m�todos aqui
		 */

		public void cadastrarFuncionario(Funcionario func)
				throws Exception {
			controller.create(func);
		}

		public void editarEstoque(Funcionario func)
				throws Exception {
			controller.edit(func);
		}

		public void excluirEstoque(Funcionario func)
				throws Exception {
			controller.destroy(func);
		}

		public void findUBSById(Integer id) throws Exception {
			controller.recuperarPeloID(Funcionario.class, id);
		}

		public void listarAllEstoque() throws Exception {
			controller.list(Funcionario.class);
		}
}
