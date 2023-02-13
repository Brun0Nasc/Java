package com.bruno.estruturadados.teste;

import com.bruno.estruturadados.Lista;

public class Ex02 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");
        lista.adiciona("D");
        
        System.out.println(lista.ultimoIndex("A"));
    }
}
