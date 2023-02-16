package com.bruno.estruturadados.teste;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 extends Ex06{
    public static void main(String[] args) {
        
        //Criação das variáveis
        Scanner scan = new Scanner(System.in);
        
        //Criar vetor com capacidade de 20
        ArrayList<Contato> lista = new ArrayList<Contato>(20);
        
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
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
                default:
                    break;
            }
        }
    }
    
    private static void imprimirVetor(ArrayList<Contato> lista){
        System.out.println(lista);
    }
    
    private static void limparVetor(ArrayList<Contato> lista){
        lista.clear();
        System.out.println("Todos os contatos do vetor foram excluídos");
    }
    
    private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("Tamanho do vetor é " + lista.size());
    }
    
    private static void excluirPosicao(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);
        
        try{
            lista.remove(pos);
            System.out.println("Contato exclído");
        }catch(Exception e){
            System.out.println("Posição inválida");
        }
    }
    
     private static void excluirContato(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);
        
        try{
            Contato contato = lista.get(pos);
            lista.remove(contato);
            System.out.println("Contato exclído");
        }catch(Exception e){
            System.out.println("Posição inválida");
        }
    }
    
    private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        
        try{
            Contato contato = lista.get(pos);
            boolean existe = lista.contains(contato);
            
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
    
    private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        
        try{
            Contato contato = lista.get(pos);
            
            System.out.println("Contato existe, seguem dados: ");
            
            System.out.println(contato);
            
            System.out.println("Fazendo pesquisa do último índice do contato encontrado");
            pos = lista.lastIndexOf(contato);
            
            System.out.println("Contato encontrado na posição " + pos);
        }catch(Exception e){
            System.out.println("Posição inválida");
        }
    }
    
    private static void obtemContato(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        
        try{
            Contato contato = lista.get(pos);
            
            System.out.println("Contato existe, seguem dados: ");
            
            System.out.println(contato);
            
            System.out.println("Fazendo pesquisa do contato encontrado");
            pos = lista.indexOf(contato);
            System.out.println("Contato encontrado na posição " + pos);
        }catch(Exception e){
            System.out.println("Posição inválida");
        }
    }
    
    private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        
        try{
            Contato contato = lista.get(pos);
            
            System.out.println("Contato existe, seguem dados: ");
            
            System.out.println(contato);
        }catch(Exception e){
            System.out.println("Posição inválida");
        }
    }
    
    private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o telefone: ", scan);
        String email = leInformacao("Entre com email: ", scan);
        
        Contato contato = new Contato(nome, telefone, email);
        
        System.out.println("Contato adicionado com sucesso!");
        
        lista.add(contato);
    }
    
    private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o telefone: ", scan);
        String email = leInformacao("Entre com email: ", scan);
        
        Contato contato = new Contato(nome, telefone, email);
        
        int pos = leInformacaoInt("Entre com a posição que o contato deve ser adicionado", scan);
        
        try {
            lista.add(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch(Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }
    
    private static void criarContatos(int quantidade, ArrayList<Contato> lista) {
        Contato contato;
        for(int i = 1; i<=quantidade; i++) {
            contato = new Contato("Nome " + i, "Telefone " + i, "Email " + i);
            
            lista.add(contato);
        }
    }
}
