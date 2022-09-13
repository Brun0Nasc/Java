/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodeluta.services;

/**
 *
 * @author Senai wcc
 */
public abstract class Lutador {
    private String nome;
    private int life;
    private String frase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    public String andar() {
        return this.nome + " andando.";
    }
    
    public String pular() {
        return this.nome + " pulando.";
    }
    
    public abstract String getEspecial();
    public abstract String getPoder();
    public abstract String atacar();
}
