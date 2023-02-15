package com.bruno.estruturadados;

import java.lang.reflect.Array;

public class Lista<T> {
        private T[] elementos;
    private int tamanho;
    
    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    /*
    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade); 
        this.tamanho = 0;
    }
    */
    
    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    
    public boolean adiciona(int posicao, T elemento) {
        
        if(!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        
        for (int i = this.tamanho; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        
        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        return true;
    }
    
    public void remove(int posicao) {
        if(!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        
        for(int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        
        this.tamanho--;
    }
    
    public void remove(T elemento) {
        int pos = this.busca(elemento);
        
        if(pos > -1){
            this.remove(pos);
        } else {
            throw new IllegalArgumentException("Elemento inexistente");
        }
    }
    
    public void limpa() {
        /*
        Opção 1
        this.elementos = (T[]) new Object[this.elementos.length];
        */
        
        /*
        Opção 2
        this.tamanho = 0
        */
        
        //Opção 3
        for(int i = 0; i < this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }
    
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    // Método que serve pra resolução do exercício 04
    public T busca(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        
        return this.elementos[posicao];
    }
    
    // Método pedido pelo exercicio 04 que vai utilizar o método busca
    public T obtem(int posicao) {
        return this.busca(posicao);
    }
    
    public int busca(T elemento) {
        for (int i = 0; i<this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    // Exercicio 01
    public boolean contem(T elemento) {
        // se o elemento existir retorna um true, se nao, retorna um false
        return this.busca(elemento) > -1;
    }
    
    /* 
    * Exercicio 02
    * itera na lista de trás pra frente e retorna imediatamente o último indice
    */
    public int ultimoIndex(T elemento) {
        for (int i = tamanho-1; i >=0 ; i--) {
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        
        return -1;
    }
    
    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        
        s.append("[");
        
        for(int i = 0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        if(this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }
}
