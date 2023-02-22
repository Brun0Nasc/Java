package com.bruno.pilhas;

import com.bruno.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){
        super();
    }
    
    public Pilha(int capacidade) {
        super(capacidade);
    }
    
    public void empilha(T elemento){
        super.adiciona(elemento);
        
    }
    
}
