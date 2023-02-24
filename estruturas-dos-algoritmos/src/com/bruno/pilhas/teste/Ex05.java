package com.bruno.pilhas.teste;

import java.util.Stack;

public class Ex05 {
    public static void main(String[] args) {
        imprimeResultado("ADA");
        imprimeResultado("Subinoonibus");
        imprimeResultado("Bruno");
    }
    
    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palíndromo? " + testaPalindromo(palavra));
    }
    
    public static boolean testaPalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();
        
        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }
        
        String palavraInversa = "";
        
        while(!pilha.isEmpty()) {
            palavraInversa += pilha.pop();
        }
        
        return palavraInversa.equalsIgnoreCase(palavra);
    }
}
