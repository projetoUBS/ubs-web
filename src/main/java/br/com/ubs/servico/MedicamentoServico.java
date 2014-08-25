package br.com.ubs.servico;

import br.ubs.com.modelo.Medicamento;

public class MedicamentoServico {

	/*
	 * Se a classe não necessitar de selects específicos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private MedicamentoControle controller;

		private static MedicamentoServico instance = new MedicamentoServico();

		public static MedicamentoServico getInstance() {
			return instance;
		}

		public MedicamentoServico() {
			controller = new MedicamentoControle();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarMedicamento(Medicamento medic)
				throws Exception {
			controller.create(medic);
		}

		public void editarMedicamento(Medicamento medic)
				throws Exception {
			controller.edit(medic);
		}

		public void excluirMedicamento(Medicamento medic)
				throws Exception {
			controller.destroy(medic);
		}

		public void findMedicamentoById(Integer id) throws Exception {
			controller.recuperarPeloID(MedicamentoEstoque.class, id);
		}

		public void listarAllMedicamento() throws Exception {
			controller.list(Medicamento.class);
		}
}
