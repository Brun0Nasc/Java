package com.bruno.pilhas.teste;

import com.bruno.pilhas.Pilha;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);
        pilha = criaLivros();
        System.out.println(pilha);
        
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);
        
        opcaoMenu(scanner);
    }
    
    private static Pilha<Livro> criaLivros() {
        Pilha<Livro> pilha = new Pilha<>(20);
        
        for(int i = 1; i <= 6; i++) {
            Livro l = new Livro();
            l.setNome("Livro " + i);
            l.setIsbn(i);
            l.setAutor("Autor " + i);
            l.setAno(2020 + i);
            
            pilha.empilha(l);
        }
        
        return pilha;
    }
    
    private static int opcaoMenu(Scanner scanner) {
        System.out.println("Selecione a operação que você deseja realizar");
        System.out.print("[1] Adicionar um novo livro \n"
                + "[2] Retirar um livro da pilha \n"
                + "[3] Ver último livro da pilha \n"
                + "[4] Verificar se a pilha está vazia \n"
                + "[5] Ver tamanho da pilha \n"
                + "[6] Mostrar pilha completa \n"
                + "[0] Sair \n"
                + "R: ");
        int opcao = scanner.nextInt();
        
        return opcao;
    }
}
