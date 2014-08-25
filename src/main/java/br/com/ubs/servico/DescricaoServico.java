package br.com.ubs.servico;

import br.ubs.com.modelo.Agenda;
import br.ubs.com.modelo.Descricao;

public class DescricaoServico {

	// private DescricaoControle controller;

		private static DescricaoServico instance = new DescricaoServico();

		public static DescricaoServico getInstance() {
			return instance;
		}

		public DescricaoServico() {
			controller = new DescricaoControle();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarDescricao(Descricao descricao)
				throws Exception {
			controller.create(descricao);
		}

		public void editarDescricao(Descricao descricao)
				throws Exception {
			controller.edit(descricao);
		}

		public void excluirDescricao(Descricao descricao)
				throws Exception {
			controller.destroy(descricao);
		}

		public void findUBSById(Integer id) throws Exception {
			controller.recuperarPeloID(Descricao.class, id);
		}

		public void listarAllDescricao() throws Exception {
			controller.list(Descricao.class);
		}
}
