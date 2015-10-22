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
public class Vga {
    
    private boolean ligar;
    
    public Vga(){
        ligar = false;
    }
    
    public void exibirDados(){
        System.out.println("Estou exibindo os dados...");
    }   

    public void ligarDesligar(){
        if( ligar == true){
            System.out.println("Desligando a placa de video...");
            ligar = false;
        }else{
            System.out.println("Ligando a placa de video...");
            ligar = true;
        }
    }
    
}
