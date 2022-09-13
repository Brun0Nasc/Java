/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodeluta;

import java.util.Scanner;
import jogodeluta.services.EscolheLutador;
import jogodeluta.services.Lutador;

/**
 *
 * @author Senai wcc
 */
public class JogoDeLuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Escolha o lutador (1) Megamente (2) Ana Maria Braga: ");
            int lutador = entrada.nextInt();
            
            EscolheLutador escolheLutador = EscolheLutador.values()[lutador-1];
            
            Lutador l = escolheLutador.escolherLutador();
            
            iniciar(l);
        }
    }
    
    public static void iniciar(Lutador lutador) {
        System.out.println(lutador.getFrase());
        System.out.println(lutador.andar());
        System.out.println(lutador.atacar());
        System.out.println(lutador.getPoder());
        System.out.println(lutador.getEspecial());
    }
    
}
