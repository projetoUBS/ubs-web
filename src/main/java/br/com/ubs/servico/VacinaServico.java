package br.com.ubs.servico;

import br.ubs.com.modelo.Vacina;

public class VacinaServico {

	/*
	 * Se a classe não necessitar de selects específicos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private VacinaControle controller;

		private static VacinaServico instance = new VacinaServico();

		public static VacinaServico getInstance() {
			return instance;
		}

		public VacinaServico() {
			controller = new VacinaControle();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarVacina(Vacina vacina)
				throws Exception {
			controller.create(vacina);
		}

		public void editarVacina(Vacina vacina)
				throws Exception {
			controller.edit(vacina);
		}

		public void excluirVacina(Vacina vacina)
				throws Exception {
			controller.destroy(vacina);
		}

		public void findVacinaById(Integer id) throws Exception {
			controller.recuperarPeloID(Vacina.class, id);
		}

		public void listarAllVacina() throws Exception {
			controller.list(Vacina.class);
		}

		
}
