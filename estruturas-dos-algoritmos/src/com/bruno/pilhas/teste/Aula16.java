/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.pilhas.teste;

import com.bruno.pilhas.Pilha;

/**
 *
 * @author brisa
 */
public class Aula16 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        System.out.println(pilha.topo());
        
        System.out.println(pilha);
        
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        
        System.out.println(pilha.topo());
        
        System.out.println(pilha);
    }
}
