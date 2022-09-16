/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamentostrategy.formasdepagamento;

import pagamentostrategy.pagamento.EstrategiaPagamento;

/**
 *
 * @author brisa
 */
public class PagamentoDinheiro implements EstrategiaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagou em dinheiro R$ " + valor);
    }
    
}
