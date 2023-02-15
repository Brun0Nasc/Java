package com.bruno.estruturadados.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        // Métodos de adicionar no arrayList
        arrayList.add("A");
        arrayList.add("C");
        
        System.out.println(arrayList);
        
        //Adicionando na posição informada
        arrayList.add(1, "B");
        
        System.out.println(arrayList);
        
        //Verificando se elemento existe no arrayList
        boolean existe = arrayList.contains("A");
        if (existe) {
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento não existe no array");
        }
        
        //Pegando posição do elemento especificado do array
        int posicao = arrayList.indexOf("D");
        if (posicao > -1) {
            System.out.println("Elemento existe no array, na posição " + posicao);
        } else {
            System.out.println("Elemento não existe no array");
        }
        
        //Retornando objeto do array através da posição informada no método
        System.out.println("Método get: " + arrayList.get(2));
        
        //Removendo elementos do array tanto pelo índice quanto pelo elemento especificado
        arrayList.remove(0);
        arrayList.remove("B");
        
        System.out.println(arrayList);
        
        //Verificando tamanho do array
        System.out.println(arrayList.size());
        
        //Ultimo index
        System.out.println(arrayList.lastIndexOf("C"));
    }
}
