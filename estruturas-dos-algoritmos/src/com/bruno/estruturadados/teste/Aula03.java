package com.bruno.estruturadados.teste;

import com.bruno.estruturadados.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);
        
        if(vetor.adiciona("elemento 1")) {
            System.out.println("Jonas");
        }
        vetor.adiciona("elemento 2");
        if(!vetor.adiciona("elemento 3")) {
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        }
        
    }
}
