package com.bruno.estruturadados.teste;

import com.bruno.estruturadados.Vetor;

public class Aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("G");
        
        System.out.println(vetor);
        
        vetor.adiciona(0, "A");
        
        System.out.println(vetor);
    }
}
