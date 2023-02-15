package com.bruno.estruturadados.teste;

import com.bruno.estruturadados.Lista;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Lista<Contato> lista = new Lista<Contato>(20);
        
        criarContatos(5, lista);
        
        Scanner scan = new Scanner(System.in);
        
        int opcao = obterOpcaoMenu(scan);
    }
    
    private static int obterOpcaoMenu(Scanner scan) {
        
        boolean entradaValida = false;
        
        int opcao = 0;
        String entrada;
        
        while(!entradaValida){
            System.out.println("Digite a opção desejada");
            System.out.println("0: Sair.");
            System.out.println("1: Adiciona contato ao final do vetor.");
            System.out.println("2: Adiciona contato em uma posição especifica.");
            System.out.println("3: Consulta contato de uma posição especifica");
            System.out.println("4: Consulta contato.");
            System.out.println("5: Ultimo indice da lista de contatos.");
            System.out.println("6: Verifica se contato existe.");
            System.out.println("7: Remove por posição.");
            System.out.println("8: Excluir contato.");
            System.out.println("9: Verifica tamanho da lista.");
            System.out.println("10: Excluir todos os contatos da lista");
            System.out.println("11: Imprime lista.");
        
            try{
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
                
                if(opcao >= 0 && opcao <= 11){
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch(Exception e){ 
                System.out.println("Entrada inválida, digite novamente"); 
            }
        
        }
        
        return opcao;
    }
    
    private static void criarContatos(int quantidade, Lista<Contato> lista) {
        Contato contato;
        for(int i = 1; i<=quantidade; i++) {
            contato = new Contato("Nome " + i, "Telefone " + i, "Email " + i);
            
            lista.adiciona(contato);
        }
    }
}
