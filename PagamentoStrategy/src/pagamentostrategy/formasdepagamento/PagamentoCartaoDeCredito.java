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
public class PagamentoCartaoDeCredito implements EstrategiaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagou no crédito R$ "+valor);
    }
    
}
