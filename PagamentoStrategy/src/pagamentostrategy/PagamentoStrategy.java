/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pagamentostrategy;

import pagamentostrategy.context.Compra;
import pagamentostrategy.formasdepagamento.PagamentoCartaoDeCredito;
import pagamentostrategy.formasdepagamento.PagamentoDinheiro;

/**
 *
 * @author brisa
 */
public class PagamentoStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compra c = new Compra(150.5);
        
        c.processarCompra(new PagamentoCartaoDeCredito());
        
        c = new Compra(75.0);
        
        c.processarCompra(new PagamentoDinheiro());
    }
    
}
