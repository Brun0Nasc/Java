package com.bruno.estruturadados.teste;

import com.bruno.estruturadados.Lista;

public class Ex05 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(3);
        
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        
        System.out.println(lista);
        
        lista.limpa();
        
        System.out.println(lista);
    }
}
