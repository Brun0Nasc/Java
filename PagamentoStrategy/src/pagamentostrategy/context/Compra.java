/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamentostrategy.context;

import pagamentostrategy.pagamento.EstrategiaPagamento;

/**
 *
 * @author brisa
 */
public class Compra {
    private final double valor;
    
    public Compra(double valor){
        this.valor = valor;
    }
    
    public void processarCompra(EstrategiaPagamento estrategiaPagamento){
        estrategiaPagamento.pagar(valor);
    }
}
