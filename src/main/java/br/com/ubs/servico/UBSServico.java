package br.com.ubs.servico;

import br.com.ubs.controle.UBSControle;
import br.ubs.com.modelo.UBS;

public class UBSServico {

	private UBSControle controller;

    private static UBSServico instance = new UBSServico();    

    public static UBSServico getInstance(){
          return instance;
    }

    public UBSServico(){
          controller = new UBSControle(); 
    }

    // métodos   

    public void cadastrarUBS (UBS ubs) throws Exception {
          controller.create(ubs);
    }
   
    public void editarUBS (UBS ubs) throws Exception {
    	controller.edit(ubs);
    }	

    public void excluirUBS (UBS ubs) throws Exception {
    	controller.destroy(ubs);
    }	
     
    public void findUBSByLocalidade(String localidade) throws Exception {
    	controller.findByLocalidade(localidade);
    }	
    /*
     * Quais parâmetros colocar nos controller.*?
    public void findUBSById (UBS ubs) throws Exception {
    	controller.recuperarPeloID(***);
    }
    
    public void listarAllUBS (List <UBS> ubs) throws Exception {
    	controller.list(***);
    }*/
}
