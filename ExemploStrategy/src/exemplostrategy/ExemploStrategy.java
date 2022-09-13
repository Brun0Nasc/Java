/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplostrategy;

import exemplostrategy.service.Frete;
import exemplostrategy.service.TipoFrete;
import java.util.Scanner;

/**
 *
 * @author brisa
 */
public class ExemploStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){
            System.out.print("Informe a distância: ");
            int distancia =  entrada.nextInt();
            System.out.print("Informe o tipo de frete (1)Normal (2)Sedex: ");
            int opcaoFrete = entrada.nextInt();
            
            TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
            
            Frete frete = tipoFrete.obterFrete();
            double preco = frete.calcularPreco(distancia);
            
            System.out.printf("Valor do frete: R$ %.2f\n", preco);
        }
    }
    
}
