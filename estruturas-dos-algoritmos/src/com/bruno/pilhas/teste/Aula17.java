package com.bruno.pilhas.teste;

import com.bruno.pilhas.Pilha;

public class Aula17 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        
        System.out.println(pilha);
        
        pilha.desempilha();
        
        System.out.println(pilha);
        
        pilha.desempilha();
        
        System.out.println(pilha);
    }
}
