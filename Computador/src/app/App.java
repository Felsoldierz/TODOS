/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import computador.Computador;

/**
 *
 * @author UTFPR
 */
public class App {
    
    public static void main(String[] args) {
        
        Computador c = new Computador();
        c.ligarDesligar();
        c.abrirPrograma();
        System.out.println("*******************");
        c.ligarDesligar();
        
    }
    
}
