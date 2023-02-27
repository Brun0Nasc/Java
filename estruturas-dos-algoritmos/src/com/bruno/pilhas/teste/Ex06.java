package com.bruno.pilhas.teste;

import com.bruno.pilhas.Pilha;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println(verificaExpressao("(A+B"));
        System.out.println(verificaExpressao(")A+B(-(C+D"));
        System.out.println(verificaExpressao("{[C(A+B)]+D}"));
    }
    
    final static String ABRE = "([{";
    final static String FECHA = ")]}";
    
    private static boolean verificaExpressao(String exp) {
        Pilha<Character> pilha = new Pilha<>();
        
        for(int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (ABRE.indexOf(c) > -1) {
                pilha.empilha(c);
            } else if (FECHA.indexOf(c) > -1){
                if (pilha.tamanho() > 0 && FECHA.indexOf(c) == ABRE.indexOf(pilha.topo())) {
                    pilha.desempilha();
                } else {
                    return false;
                }
            }
        }
        
        return pilha.tamanho() == 0;
      }
}
