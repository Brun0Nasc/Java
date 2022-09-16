/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pagamentostrategy;

import pagamentostrategy.context2.Compra2;
import pagamentostrategy.formasdepagamento2.PagamentoCartaoDeCredito2;
import pagamentostrategy.formasdepagamento2.PagamentoDinheiro2;

/**
 *
 * @author brisa
 */
public class PagamentoStrategy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compra2 c = new Compra2("Bruno", 150.5);
        
        c.processarCompra(new PagamentoCartaoDeCredito2());
            
        System.out.println("");
        
        c = new Compra2("Nathalia", 75.0);
        
        c.processarCompra(new PagamentoDinheiro2());    
    }
    
}
