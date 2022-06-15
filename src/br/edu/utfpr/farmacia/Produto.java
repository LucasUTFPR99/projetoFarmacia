/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.farmacia;

import br.edu.utfpr.state.Disponivel;
import br.edu.utfpr.state.State;
import br.edu.utfpr.state.Vendido;

/**
 *
 * @author utfpr
 */
public class Produto {

    private State s;
    private String nome;
    private State disponivel = new Disponivel(this);
    private State vendido = new Vendido();
    //private State reservado = new Reservado();
    

    public void setS(State s) {
        this.s = s;
    }

    public State getDisponivel() {
        return disponivel;
    }

    public State getVendido() {
        return vendido;
    }

    //public State getReservado() {
        //return reservado;
    //}

    public Produto(String nome) {
        this.nome = nome;
        this.s = getDisponivel();
    }

    public void reservar() {
        s.reservar();
    }

    public void vender() {
        s.vender();
    }

}
