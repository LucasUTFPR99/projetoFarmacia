/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.state;

import br.edu.utfpr.farmacia.Produto;

/**
 *
 * @author utfpr
 */
public class Disponivel implements State {
    private Produto p;

    public Disponivel(Produto p) {
        this.p = p;
    }
    
    
    @Override
    public void reservar() {
        System.out.println("Produto reservado."); 
        //p.setS(p.getReservado());
       //Lembrar de mudar o estado.     
    }

    @Override
    public void vender() {
        System.out.println("Produto vendido.");
        p.setS(p.getVendido());
     
    }
    
}
