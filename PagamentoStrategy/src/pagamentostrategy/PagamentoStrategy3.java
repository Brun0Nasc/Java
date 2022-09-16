/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamentostrategy;

import pagamentostrategy.context3.Compra3;
import pagamentostrategy.formasdepagamento3.PagamentoCartaoDeCredito3;
import pagamentostrategy.formasdepagamento3.PagamentoDinheiro3;

/**
 *
 * @author brisa
 */
public class PagamentoStrategy3 {
    public static void main(String[] args) {
        double valor = 130.5;
        Compra3 compra = new Compra3(valor);
        
        compra.processar(new PagamentoCartaoDeCredito3());
        System.out.println("");
        compra.processar(new PagamentoDinheiro3());
    }
}
