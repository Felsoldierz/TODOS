/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

import partes.Disco;
import partes.Processador;
import partes.Vga;

/**
 *
 * @author UTFPR
 */
public class Computador {
    
    private Processador p;
    private Vga v;
    private Disco d;
    
    public Computador(){
        d = new Disco();
        v = new Vga();
        p = new Processador();
    }
    
    public void ligarDesligar(){
        p.ligarDesligar();
        d.ligarDesligar();
        v.ligarDesligar();
    }
    
    public void abrirPrograma(){
        d.lerDados();
        p.processarDados();
        v.exibirDados();
    }
    
}
