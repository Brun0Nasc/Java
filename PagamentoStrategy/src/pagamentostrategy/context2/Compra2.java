/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamentostrategy.context2;

import pagamentostrategy.pagamento2.EstrategiaPagamento2;

/**
 *
 * @author brisa
 */
public class Compra2 {
    private String comprador;
    private double valor;
    private double taxa;

    public Compra2(String comprador, double valor){
        this.comprador = comprador;
        this.valor = valor;
    }
    
    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    public void processarCompra(EstrategiaPagamento2 estrategiaPagamento){
        estrategiaPagamento.pagar(this);
    }
}
