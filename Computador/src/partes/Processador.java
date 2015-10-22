/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partes;

/**
 *
 * @author UTFPR
 */
public class Processador {
    
    private boolean ligar;
    
    public Processador(){
        ligar = false;
    }
    
    public void processarDados(){
        System.out.println("Estou processando os dados...");
    }   

    public void ligarDesligar(){
        if( ligar == true){
            System.out.println("Desligando o processador...");
            ligar = false;
        }else{
            System.out.println("Ligando o processador...");
            ligar = true;
        }
    }

}
