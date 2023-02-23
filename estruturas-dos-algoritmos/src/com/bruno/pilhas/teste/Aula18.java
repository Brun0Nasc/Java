package com.bruno.pilhas.teste;

import java.util.Stack;

public class Aula18 {
    public static void main(String[] args) {
        // funções da classe Stack
        
        Stack<Integer> stack = new Stack<>();
        
        System.out.println(stack.isEmpty()); //estaVazio
        
        stack.push(1); //empilha
        stack.push(2);
        stack.push(3);
        
        System.out.println(stack.isEmpty()); //estaVazio
        System.out.println(stack.size()); //tamanho
        System.out.println(stack.peek()); //espiar
        System.out.println(stack); //toString
        System.out.println(stack.pop()); //desempilha
        System.out.println(stack); //toString
    }
}
