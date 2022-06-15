/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.state;

/**
 *
 * @author utfpr
 */
public class Vendido implements State {

    @Override
    public void reservar() {
        System.out.println("Este produto ja foi vendido,não é possivel reservar.");
    }

    @Override
    public void vender() {
        System.out.println("Este produto ja foi vendido,não é possivel vender.");
    }
}
    
    
