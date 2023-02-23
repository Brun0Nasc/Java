package com.bruno.pilhas.teste;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {
    private static Stack<Integer> pares = new Stack<>();
    private static Stack<Integer> impares = new Stack<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++) {
            int entrada = scanner.nextInt();
            
            if (entrada != 0) {
                empilhar(entrada);
            } else {
                desempilhar();
            }
        }
        
        if (!pares.isEmpty()) {
            esvaziar(pares);
        }
        
        if (!impares.isEmpty()) {
            esvaziar(impares);
        }
        
    }
    
    private static void empilhar(int entrada) {
        
        if (entrada % 2 == 0) {
            pares.push(entrada);
        } else {
            impares.push(entrada);
        }
        
    }
    
    private static void desempilhar(){
        String error = "O elemento não pode ser removido pois a pilha está vazia.";
        String msg = "0 digitado, desempilhando ";
        
        
            if (!pares.isEmpty()) {
                System.out.println(msg + pares.pop());
            } else {
                System.out.println(error + " pares");
            }
            
            if (!impares.isEmpty()) {
                System.out.println(msg + impares.pop());
            } else {
                System.out.println(error + " impares");
            }
        
    }
    
    private static void esvaziar(Stack<Integer> pilha){
        
        while(!pilha.isEmpty()) {
            System.out.println("Desempilhando " + pilha.pop());
        }
        
    }
    
}