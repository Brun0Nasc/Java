package com.bruno.pilhas.teste;

import java.util.Stack;

public class Ex07 {
    public static void main(String[] args) {
        converteParaBin(25);
        converteParaBin(1);
        converteParaBin(2);
        converteParaBin(3);
        converteParaBin(100);
        System.out.println(converteParaQualquerBase(11, 16));
    }
    
    private static void converteParaBin(int dec) {
        Stack<Integer> pilha = new Stack<>();
        int resto;
        
        while(dec > 0) {
            resto = dec%2;
            dec/=2;
            pilha.push(resto);
        }
        
        imprimeBin(pilha);
    }
    
    private static String converteParaQualquerBase(int dec, int base) {
        Stack<Integer> pilha = new Stack<>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";
        
        while(dec > 0) {
            resto = dec%base;
            dec/=base;
            pilha.push(resto);
        }
        
        while(!pilha.isEmpty()){
            numBase += bases.charAt(pilha.pop());
        }
        
        return numBase;
    }
    
    private static void imprimeBin(Stack<Integer> pilha) {
        String bin = "";
        while(!pilha.isEmpty()) {
            bin += pilha.pop().toString();
        }
        System.out.println(bin);
    }
}
