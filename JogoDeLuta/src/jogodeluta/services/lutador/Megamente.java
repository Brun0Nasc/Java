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
public class Megamente extends Lutador {

    public Megamente() {
        this.setNome("Megamente");
        this.setFrase("Prepare-se para morrer!");
        this.setLife(100);
    }
    
    @Override
    public String getEspecial() {
        return "Cabeçada fatal!";
    }

    @Override
    public String getPoder() {
        return "Poder de "+this.getNome();
    }

    @Override
    public String atacar() {
        return "Ataque com os pés";
    }
    
}
