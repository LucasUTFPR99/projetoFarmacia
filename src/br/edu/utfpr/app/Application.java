/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.app;

import br.edu.utfpr.farmacia.Produto;

/**
 *
 * @author utfpr
 */
public class Application {
    public static void main(String[] args) {
        Produto p = new Produto("Dipirona");
        p.vender();
        p.vender();
        
    }
}
