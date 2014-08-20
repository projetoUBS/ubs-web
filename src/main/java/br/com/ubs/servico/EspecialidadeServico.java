package br.com.ubs.servico;

import br.com.ubs.controle.EspecialidadeControle;
import br.ubs.com.modelo.Especialidade;


public class EspecialidadeServico {

	private EspecialidadeControle controller;

    private static EspecialidadeServico instance = new EspecialidadeServico();    

    public static EspecialidadeServico getInstance(){
          return instance;
    }

    public EspecialidadeServico(){
          controller = new EspecialidadeControle(); 
    }

    // métodos   

    public void cadastrarEspecialidade (Especialidade especialidade) throws Exception {
          controller.create(especialidade);
    }
   
    public void editarEspecialidade (Especialidade especialidade) throws Exception {
    	controller.edit(especialidade);
    }	

    public void excluirEspecialidade (Especialidade especialidade) throws Exception {
    	controller.destroy(especialidade);
    }	
     
    public void findEspecialidadeByName(String nome) throws Exception {
    	controller.findByNome(nome);
    }	
    /*
     * Quais parâmetros colocar nos controller.*?
    public void findUBSById (***) throws Exception {
    	controller.recuperarPeloID(***);
    }
    
    public void listarAllUBS (***) throws Exception {
    	controller.list(***);
    }*/
}

