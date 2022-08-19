/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_ingridhernandez;

/**
 *
 * @author incah
 */
public class Armas {
    private String nombre;
    private int dano;
    private int presicion;

    public Armas() {
    }

    public Armas(String nombre, int dano, int presicion) {
        this.nombre = nombre;
        this.dano = dano;
        this.presicion = presicion;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getPresicion() {
        return presicion;
    }

    public void setPresicion(int presicion) {
        this.presicion = presicion;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
