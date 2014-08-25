package br.com.ubs.servico;

import br.ubs.com.modelo.Medico;

public class MedicoServico {
	
	/*
	 * Se a classe não necessitar de selects específicos, declarar :
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

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
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
