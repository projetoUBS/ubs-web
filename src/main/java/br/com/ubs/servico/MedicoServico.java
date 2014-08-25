package br.com.ubs.servico;

import br.ubs.com.modelo.Medico;

public class MedicoServico {
	
	/*
	 * Se a classe n�o necessitar de selects espec�ficos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private MedicoControle controller;

		private static MedicoServico instance = new MedicoServico();

		public static MedicoServico getInstance() {
			return instance;
		}

		public MedicoServico() {
			controller = new MedicoServico();
		}

		/* M�todos
		 * Falta gerar pkg controle e implementar os m�todos aqui
		 */

		public void cadastrarMedico(Medico medico)
				throws Exception {
			controller.create(medico);
		}

		public void editarMedico(Medico medico)
				throws Exception {
			controller.edit(medico);
		}

		public void excluirMedico(Medico medico)
				throws Exception {
			controller.destroy(medico);
		}

		public void findMedicoById(Integer id) throws Exception {
			controller.recuperarPeloID(Medico.class, id);
		}

		public void listarAllEstoque() throws Exception {
			controller.list(Medico.class);
		}

}
