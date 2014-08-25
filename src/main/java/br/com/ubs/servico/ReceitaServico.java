package br.com.ubs.servico;

import br.ubs.com.modelo.Receita;

public class ReceitaServico {

	/*
	 * Se a classe não necessitar de selects específicos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private ReceitaControle controller;

		private static ReceitaServico instance = new ReceitaServico();

		public static ReceitaServico getInstance() {
			return instance;
		}

		public ReceitaServico() {
			controller = new ReceitaControle();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarReceita(Receita receita)
				throws Exception {
			controller.create(receita);
		}

		public void editarReceita(Receita receita)
				throws Exception {
			controller.edit(receita);
		}

		public void excluirReceita(Receita receita)
				throws Exception {
			controller.destroy(receita);
		}

		public void findReceitaById(Integer id) throws Exception {
			controller.recuperarPeloID(Receita.class, id);
		}

		public void listarAllReceita() throws Exception {
			controller.list(Receita.class);
		}
}
