package com.bruno.estruturadados.teste;

import com.bruno.estruturadados.Lista;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        
        //Criação das variáveis
        Scanner scan = new Scanner(System.in);
        
        //Criar vetor com capacidade de 20
        Lista<Contato> lista = new Lista<Contato>(20);
        
        //Criar e adicionar 5 contatos
        criarContatos(5, lista);
        
        //Criar menu para o usuário escolher a opção
        int opcao = 1;
        
        while(opcao != 0) {
            opcao = obterOpcaoMenu(scan);
            
            switch(opcao){
                case 1:
                    adicionarContatoFinal(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scan, lista);
                    break;
                case 4:
                    obtemContato(scan, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7:
                    excluirPosicao(scan, lista);
                    break;
                case 8:
                    excluirContato(scan, lista);
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                default:
                    break;
            }
        }
    }
    
    private static void excluirPosicao(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);
        
        try{
            lista.remove(pos);
            System.out.println("Contato exclído");
        }catch(Exception e){
            System.out.println("Posição inválida");
        }
    }
    
     private static void excluirContato(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);
        
        try{
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato exclído");
        }catch(Exception e){
            System.out.println("Posição inválida");
        }
    }
    
    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        
        try{
            Contato contato = lista.busca(pos);
            boolean existe = lista.contem(contato);
            
            if(existe){
                System.out.println("Contato existe, seguem dados: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }
            
        }catch(Exception e){
            System.out.println("Posição inválida");
        }
    }
    
    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        
        try{
            Contato contato = lista.busca(pos);
            
            System.out.println("Contato existe, seguem dados: ");
            
            System.out.println(contato);
            
            System.out.println("Fazendo pesquisa do último índice do contato encontrado");
            pos = lista.ultimoIndex(contato);
            
            System.out.println("Contato encontrado na posição " + pos);
        }catch(Exception e){
            System.out.println("Posição inválida");
        }
    }
    
    private static void obtemContato(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        
        try{
            Contato contato = lista.busca(pos);
            
            System.out.println("Contato existe, seguem dados: ");
            
            System.out.println(contato);
            
            System.out.println("Fazendo pesquisa do contato encontrado");
            pos = lista.busca(contato);
            System.out.println("Contato encontrado na posição " + pos);
        }catch(Exception e){
            System.out.println("Posição inválida");
        }
    }
    
    private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        
        try{
            Contato contato = lista.busca(pos);
            
            System.out.println("Contato existe, seguem dados: ");
            
            System.out.println(contato);
        }catch(Exception e){
            System.out.println("Posição inválida");
        }
    }
    
    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o telefone: ", scan);
        String email = leInformacao("Entre com email: ", scan);
        
        Contato contato = new Contato(nome, telefone, email);
        
        System.out.println("Contato adicionado com sucesso!");
        
        lista.adiciona(contato);
    }
    
    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o telefone: ", scan);
        String email = leInformacao("Entre com email: ", scan);
        
        Contato contato = new Contato(nome, telefone, email);
        
        int pos = leInformacaoInt("Entre com a posição que o contato deve ser adicionado", scan);
        
        try {
            lista.adiciona(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch(Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }
    
    private static String leInformacao(String msg, Scanner scan){
        System.out.println(msg);
        String entrada = scan.nextLine();
        
        return entrada;
    }
    
    private static int leInformacaoInt(String msg, Scanner scan){
        boolean entradaValida = false;
        int num = 0;
        
        while(!entradaValida){
            try{
                System.out.println(msg);
                String entrada = scan.nextLine();
                
                num = Integer.parseInt(entrada);
                
                entradaValida = true;
                
            } catch(Exception e){
                System.out.println("Entrada inválida, digite novamente.");
            }
        }
        
        
        
        return num;
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
                System.out.println("Entrada inválida, digite novamente\n\n"); 
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
