package com.bruno.estruturadados.teste;

import com.bruno.estruturadados.Lista;

public class Ex01 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(2);
        
        lista.adiciona("A");
        lista.adiciona("B");
        
        if(lista.contem("C")) {
            System.out.println("Elemento existe na lista");
        } else {
            System.out.println("Elemento nao existe na lista");
        }
    }
}
