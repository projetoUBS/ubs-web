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

}
