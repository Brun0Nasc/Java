package com.bruno.pilhas.teste;

import java.util.Scanner;
import java.util.Stack;

public class Ex04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();
        criaLivros(pilha);
        System.out.println(pilha);
        
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);
        
        int opcao = 1;
        
        while(opcao != 0) {
            opcao = opcaoMenu(scanner);
            switch(opcao){
                case 1 -> adicionaLivro(scanner, pilha);
                case 2 -> desempilha(pilha);
                case 3 -> verUltimoLivro(pilha);
                case 4 -> verificarPilhaVazia(pilha);
                case 5 -> verTamanho(pilha);
                case 6 -> imprimirPilha(pilha);
            }
        }
        
        System.out.println("\nPrograma finalizado!");
    }
    
    private static void criaLivros(Stack<Livro> pilha) {
        
        for(int i = 1; i <= 6; i++) {
            Livro l = new Livro();
            l.setNome("Livro " + i);
            l.setIsbn(i);
            l.setAutor("Autor " + i);
            l.setAno(2020 + i);
            
            pilha.push(l);
        }
    }
    
    private static int opcaoMenu(Scanner scanner) {
        
        boolean entradaValida = false;
        
        int opcao = 0;
        String entrada;
        
        while(!entradaValida){
            System.out.println("Selecione a operação que você deseja realizar");
            System.out.print("[1] Adicionar um novo livro \n"
                    + "[2] Retirar um livro da pilha \n"
                    + "[3] Ver último livro da pilha \n"
                    + "[4] Verificar se a pilha está vazia \n"
                    + "[5] Ver tamanho da pilha \n"
                    + "[6] Mostrar pilha completa \n"
                    + "[0] Sair \n"
                    + "R: ");
            
            try{
                entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);
                
                if(opcao >= 0 && opcao <= 6) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch(Exception e) {
                System.out.println("\nEntrada inválida, digite novamente.\n");
            }
            
        }
        
        return opcao;
    }
    
    private static String leInformacao(String msg, Scanner scan) {
        System.out.print(msg);
        String entrada = scan.nextLine();
        
        return entrada;
    }
    
    private static int leInformacaoInt(String msg, Scanner scan) {
        boolean entradaValida = false;
        int num = 0;
        
        while(!entradaValida) {
            try{

                System.out.print(msg);
                String entrada = scan.nextLine();
                
                num = Integer.parseInt(entrada);
                
                entradaValida = true;
                
            }catch(NumberFormatException e){
                System.out.println("Entrada inválida, digite novamente.");
            }
        }
        
        return num;
    }
    
    private static void adicionaLivro(Scanner scan, Stack<Livro> pilha) {
        System.out.println("\nAdicionando novo livro à pilha:");
        
        String nome = leInformacao("Informe o nome do livro: ", scan);
        String autor = leInformacao("Informe o nome do autor: ", scan);
        int isbn = leInformacaoInt("Informe o ISBN do livro: ", scan);
        int ano = leInformacaoInt("Informe o ano de lançamento do livro: ", scan);
        
        
        Livro l = new Livro(nome, isbn, ano, autor);
        
        pilha.push(l);
        
        System.out.println("\nLivro adicionado com sucesso \n");
    }
    
    private static void desempilha(Stack<Livro> pilha) {
        System.out.println("\nDesempilhando " + pilha.pop() + "\n");
    }
    
    private static void verUltimoLivro(Stack<Livro> pilha) {
        System.out.println("\n"+pilha.peek() + "\n");
    }

    private static void verificarPilhaVazia(Stack<Livro> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("\nA pilha está vazia." + "\n");
        } else {
            System.out.println("\nA pilha não está vazia." + "\n");
        }
    }
    
    private static void verTamanho(Stack<Livro> pilha) {
        System.out.println("\nA pilha tem " + pilha.size() + " livros empilhados.\n");
    }
    
    private static void imprimirPilha(Stack<Livro> pilha) {
        System.out.println(pilha + "\n");
    }
    
}
