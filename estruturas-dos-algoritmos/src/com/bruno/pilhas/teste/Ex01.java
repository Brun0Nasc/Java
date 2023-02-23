package com.bruno.pilhas.teste;

import com.bruno.pilhas.Pilha;
import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Pilha<Integer> pilha = new Pilha<>();
        
        for(int i = 0; i < 10; i++) {
            
            int n = entrada.nextInt();
            
            if(n%2==0) {
                
                System.out.println("Empilhando " + n);
                pilha.empilha(n);
                
            } else {
                
                if(pilha.estaVazia()){
                    
                    System.out.println("Pilha está vazia");
                    
                } else {
                    
                    System.out.println("Desempilhando " + pilha.desempilha());
                    
                }
            }
        }
        
        if(!pilha.estaVazia()) {
            
            for (int i = 0; i < pilha.tamanho(); i++) {
                
                System.out.println("Desempilhando " + pilha.desempilha());
                
            }
        }
        
        System.out.println("Pilha esvaziada.");
        
    }
}
