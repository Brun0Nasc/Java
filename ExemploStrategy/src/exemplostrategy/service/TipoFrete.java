/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplostrategy.service;

import exemplostrategy.service.frete.Normal;
import exemplostrategy.service.frete.Sedex;

/**
 *
 * @author brisa
 */
public enum TipoFrete {
    NORMAL {
        @Override
        public Frete obterFrete() {
            return new Normal();
        }
    },
    SEDEX {
        @Override
        public Frete obterFrete() {
            return new Sedex();
        }
    };
    
    public abstract Frete obterFrete();
}
