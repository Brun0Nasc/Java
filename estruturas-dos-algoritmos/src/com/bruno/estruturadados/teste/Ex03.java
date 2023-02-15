package com.bruno.estruturadados.teste;

import com.bruno.estruturadados.Lista;

public class Ex03 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        
        System.out.println(lista);
        
        lista.remove("B");
        
        lista.remove("D");
        
        System.out.println(lista);
    }
}
