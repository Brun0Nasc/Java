/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodeluta.services;

import jogodeluta.services.lutador.AnaMariaBraga;
import jogodeluta.services.lutador.Megamente;

/**
 *
 * @author Senai wcc
 */
public enum EscolheLutador {
    MEGAMENTE {
        @Override
        public Lutador escolherLutador() {
            return new Megamente();
        }
    },
    ANAMARIABRAGA {
        @Override
        public Lutador escolherLutador() {
            return new AnaMariaBraga();
        }
    };
    
    public abstract Lutador escolherLutador();
}
