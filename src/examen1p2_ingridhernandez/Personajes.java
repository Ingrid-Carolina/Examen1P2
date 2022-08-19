/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_ingridhernandez;

import java.util.ArrayList;

/**
 *
 * @author incah
 */
public class Personajes {
    private String nombre;
    private int vida;
    private int escudo;
    private  Armas arma;
    

    public Personajes() {
    }

    public Personajes(String nombre, int vida, int escudo, Armas arma) {
        this.nombre = nombre;
        this.vida = vida;
        this.escudo = escudo;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", vida=" + vida + ", escudo=" + escudo + ", arma=" + arma + '}';
    }

   

    
    
}
