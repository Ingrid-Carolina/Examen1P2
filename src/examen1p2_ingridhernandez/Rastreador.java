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
public class Rastreador extends Personajes{

    public Rastreador() {
        super();
       
    }

    public Rastreador(String nombre, int vida, int escudo, Armas arma) {
        super(nombre, vida, escudo, arma);
    }

    @Override
    public String toString() {
        return "Rastreador{" + '}';
    }
    
    
    
}
