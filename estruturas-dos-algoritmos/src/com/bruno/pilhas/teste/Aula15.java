package com.bruno.pilhas.teste;

import com.bruno.pilhas.Pilha;

public class Aula15 {
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        pilha.empilha(1);
        
        if(pilha.estaVazia()) {
            System.out.println("A pilha está vazia");
        } else {
            System.out.println("A pilha não está vazia");
        }
    }
}
