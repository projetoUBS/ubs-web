package br.com.ubs.servico;

import br.ubs.com.modelo.Paciente;

public class PacienteServico {

	/*
	 * Se a classe não necessitar de selects específicos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private PacienteControle controller;

		private static PacienteServico instance = new PacienteServico();

		public static PacienteServico getInstance() {
			return instance;
		}

		public PacienteServico() {
			controller = new PacienteServico();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarPaciente(Paciente paciente)
				throws Exception {
			controller.create(paciente);
		}

		public void editarPaciente(Paciente paciente)
				throws Exception {
			controller.edit(paciente);
		}

		public void excluirPaciente(Paciente paciente)
				throws Exception {
			controller.destroy(paciente);
		}

		public void findPacienteById(Integer id) throws Exception {
			controller.recuperarPeloID(Paciente.class, id);
		}

		public void listarAllPaciente() throws Exception {
			controller.list(Paciente.class);
		}
}
