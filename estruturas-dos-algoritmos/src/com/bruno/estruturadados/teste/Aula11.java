package com.bruno.estruturadados.teste;

import com.bruno.estruturadados.Lista;

public class Aula11 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista(2);
        
        vetor.adiciona("Bruno");
        vetor.adiciona("Nathalia");
        
        System.out.println(vetor);
    }
}
