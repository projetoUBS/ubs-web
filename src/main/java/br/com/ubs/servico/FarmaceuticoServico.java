package br.com.ubs.servico;
import br.ubs.com.modelo.Farmaceutico;


public class FarmaceuticoServico {

	/*
	 * Se a classe não necessitar de selects específicos, declarar :
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

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
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
