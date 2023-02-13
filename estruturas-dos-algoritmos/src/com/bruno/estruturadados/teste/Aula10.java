package com.bruno.estruturadados.teste;

import com.bruno.estruturadados.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);
        
        Contato c1 = new Contato("Bruno", "123", "bruno@mail");
        Contato c2 = new Contato("Nathalia", "321", "nath@mail");
        Contato c3 = new Contato("Davi", "312", "davi@mail");
        
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        
        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);
        
        System.out.println(vetor.busca(c1));
    }
}
