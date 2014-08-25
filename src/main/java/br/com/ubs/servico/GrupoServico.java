package br.com.ubs.servico;

import br.ubs.com.modelo.Grupo;

public class GrupoServico {
	
	/*
	 * Se a classe não necessitar de selects específicos, declarar :
	 * 	private GenericoDAOJPA controller;
	 */
	// private GrupoControle controller;

		private static GrupoServico instance = new GrupoServico();

		public static GrupoServico getInstance() {
			return instance;
		}

		public GrupoServico() {
			controller = new GrupoControle();
		}

		/* Métodos
		 * Falta gerar pkg controle e implementar os métodos aqui
		 */

		public void cadastrarGrupo(Grupo grupo)
				throws Exception {
			controller.create(grupo);
		}

		public void editarGrupo(Grupo grupo)
				throws Exception {
			controller.edit(grupo);
		}

		public void excluirGrupo(Grupo grupo)
				throws Exception {
			controller.destroy(grupo);
		}

		public void findGrupoById(Integer id) throws Exception {
			controller.recuperarPeloID(Grupo.class, id);
		}

		public void listarAllGrupo() throws Exception {
			controller.list(Grupo.class);
		}

}
