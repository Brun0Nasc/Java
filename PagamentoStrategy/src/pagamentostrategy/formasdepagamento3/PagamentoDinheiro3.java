/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamentostrategy.formasdepagamento3;

import pagamentostrategy.context3.Pagavel3;
import pagamentostrategy.pagamento3.EstrategiaPagamento3;

/**
 *
 * @author brisa
 */
public class PagamentoDinheiro3 implements EstrategiaPagamento3 {

    @Override
    public void pagar(Pagavel3 pagavel) {
        System.out.println("Pagou no dinheiro R$ " + pagavel.getValor());
    }
    
}
