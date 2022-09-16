/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamentostrategy.context3;

import pagamentostrategy.pagamento3.EstrategiaPagamento3;

/**
 *
 * @author brisa
 */
public class Compra3 implements Pagavel3 {
    private final double valor;
    
    public Compra3(double valor) {
        this.valor = valor;
    }
    
    public void processar(EstrategiaPagamento3 estrategiaPagamento){
        estrategiaPagamento.pagar(this);
    }
    
    @Override
    public double getValor() {
        return valor;
    }
    
}
