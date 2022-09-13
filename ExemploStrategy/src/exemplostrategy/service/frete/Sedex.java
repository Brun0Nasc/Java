/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplostrategy.service.frete;

import exemplostrategy.service.Frete;

/**
 *
 * @author brisa
 */
public class Sedex implements Frete {
    @Override
    public double calcularPreco(int distancia) {
        return distancia * 1.45 + 12;
    }
}
