/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodeluta.services.lutador;

import jogodeluta.services.Lutador;

/**
 *
 * @author Senai wcc
 */
public class AnaMariaBraga extends Lutador {

    public AnaMariaBraga(){
        this.setNome("Ana Maria");
        this.setFrase("Acorda menino!");
        this.setLife(100);
    }
    
    @Override
    public String getEspecial() {
        return "Solta os cachorros!";
    }

    @Override
    public String getPoder() {
        return "Ataque do Louro José";
    }

    @Override
    public String atacar() {
        return "Ataque com as mãos";
    }
    
}
