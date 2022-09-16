/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamentostrategy.formasdepagamento2;

import pagamentostrategy.context2.Compra2;
import pagamentostrategy.pagamento2.EstrategiaPagamento2;

/**
 *
 * @author brisa
 */
public class PagamentoDinheiro2 implements EstrategiaPagamento2 {

    @Override
    public void pagar(Compra2 compra) {
        compra.setTaxa(0);
        
        System.out.println("Pagamento em dinheiro.");
        System.out.println("Cliente: " + compra.getComprador());
        System.out.println("Taxa adicional: " + compra.getTaxa());
        System.out.println("Valor total a pagar: " + (compra.getValor()+compra.getTaxa()));
    }
    
}
