package br.com.ubs.servico;
import br.ubs.com.modelo.Farmaceutico;


public class FarmaceuticoServico {

	/*
	 * Se a classe n�o necessitar de selects espec�ficos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private FarmaceuticoControle controller;

		private static FarmaceuticoServico instance = new FarmaceuticoServico();

		public static FarmaceuticoServico getInstance() {
			return instance;
		}

		public FarmaceuticoServico() {
			controller = new FarmaceuticoControle();
		}

		/* M�todos
		 * Falta gerar pkg controle e implementar os m�todos aqui
		 */

		public void cadastrarFarmaceutico(Farmaceutico farmaceutico)
				throws Exception {
			controller.create(farmaceutico);
		}

		public void editarFarmaceutico(Farmaceutico farmaceutico)
				throws Exception {
			controller.edit(farmaceutico);
		}

		public void excluirFarmaceutico(Farmaceutico farmaceutico)
				throws Exception {
			controller.destroy(farmaceutico);
		}

		public void findUBSById(Integer id) throws Exception {
			controller.recuperarPeloID(Farmaceutico.class, id);
		}

		public void listarAllFarmaceutico() throws Exception {
			controller.list(Farmaceutico.class);
		}
}
