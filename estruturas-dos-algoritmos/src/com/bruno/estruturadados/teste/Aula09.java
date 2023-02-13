package com.bruno.estruturadados.teste;

import com.bruno.estruturadados.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        
        System.out.println(vetor);
        
        vetor.remove(1);
        
        System.out.println(vetor);
        
        vetor.remove("F");
        
        System.out.println(vetor);
    }
}
