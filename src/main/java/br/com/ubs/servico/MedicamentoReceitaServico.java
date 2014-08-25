package br.com.ubs.servico;

import br.ubs.com.modelo.MedicamentoReceita;

public class MedicamentoReceitaServico {

	/*
	 * Se a classe não necessitar de selects específicos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private MedicamentoReceitaControle controller;

		private static MedicamentoReceitaServico instance = new MedicamentoReceitaServico();

		public static MedicamentoReceitaServico getInstance() {
			return instance;
		}

		public MedicamentoReceitaServico() {
			controller = new MedicamentoReceitaControle();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarMedReceita(MedicamentoReceita medReceita)
				throws Exception {
			controller.create(medReceita);
		}

		public void editarMedReceita(MedicamentoReceita medReceita)
				throws Exception {
			controller.edit(medReceita);
		}

		public void excluirMedReceita(MedicamentoReceita medReceita)
				throws Exception {
			controller.destroy(medReceita);
		}

		public void findMedReceitaById(Integer id) throws Exception {
			controller.recuperarPeloID(MedicamentoReceita.class, id);
		}

		public void listarAllMedReceita() throws Exception {
			controller.list(MedicamentoReceita.class);
		}
}
