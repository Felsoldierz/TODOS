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
public class Disco {
    
    private boolean ligar;
    
    public Disco(){
        ligar = false;
    }
    
    public void lerDados(){
        System.out.println("Estou lendo os dados...");
    }   

    public void ligarDesligar(){
        if( ligar == true){
            System.out.println("Desligando o disco rigido...");
            ligar = false;
        }else{
            System.out.println("Ligando o disco rigido...");
            ligar = true;
        }
    }
    
}
