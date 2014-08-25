package br.com.ubs.servico;

import br.ubs.com.modelo.Procedimento;

public class ProcedimentoServico {

	/*
	 * Se a classe n�o necessitar de selects espec�ficos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private ProcedimentoControle controller;

		private static ProcedimentoServico instance = new ProcedimentoServico();

		public static ProcedimentoServico getInstance() {
			return instance;
		}

		public ProcedimentoServico() {
			controller = new ProcedimentoControle();
		}

		/* M�todos
		 * Falta gerar pkg controle e implementar os m�todos aqui
		 */

		public void cadastrarProcedimento(Procedimento proc)
				throws Exception {
			controller.create(proc);
		}

		public void editarProcedimento(Procedimento proc)
				throws Exception {
			controller.edit(proc);
		}

		public void excluirProcedimento(Procedimento proc)
				throws Exception {
			controller.destroy(proc);
		}

		public void findProcedimentoById(Integer id) throws Exception {
			controller.recuperarPeloID(Procedimento.class, id);
		}

		public void listarAllProcedimento() throws Exception {
			controller.list(Procedimento.class);
		}
		
}
