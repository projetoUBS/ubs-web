package br.com.ubs.servico;

import br.ubs.com.modelo.Enfermeiro;

public class EnfermeiroServico {
	
	// private EnfermeiroControle controller;

		private static EnfermeiroServico instance = new EnfermeiroServico();

		public static EnfermeiroServico getInstance() {
			return instance;
		}

		public EnfermeiroServico() {
			controller = new EnfermeiroControle();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarEnfermeiro(Enfermeiro enfermeiro)
				throws Exception {
			controller.create(enfermeiro);
		}

		public void editarEnfermeiro(Enfermeiro enfermeiro)
				throws Exception {
			controller.edit(Enfermeiro);
		}

		public void excluirEnfermeiro(Enfermeiro enfermeiro)
				throws Exception {
			controller.destroy(enfermeiro);
		}

		public void findUBSById(Integer id) throws Exception {
			controller.recuperarPeloID(Enfermeiro.class, id);
		}

		public void listarAllEnfermeiro() throws Exception {
			controller.list(Enfermeiro.class);
		}

}
