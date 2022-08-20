/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_ingridhernandez;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author incah
 */
public class Jugar {
    static Random r = new Random ();
    ArrayList<Jugadores>jug;
    private String usuario;
    private int ID;
    private String contra;

    public Jugar() {
    }

    public Jugar(ArrayList<Jugadores> jug, String usuario, int ID, String contra ) {
        this.jug = jug;
        this.usuario = usuario;
        this.ID = ID;
        this.contra = contra;
        }

    public static Random getR() {
        return r;
    }

    public static void setR(Random r) {
        Jugar.r = r;
    }

    public ArrayList<Jugadores> getJug() {
        return jug;
    }

    public void setJug(ArrayList<Jugadores> jug) {
        this.jug = jug;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
    
    
    
    
    
    public int ID() {
        boolean p = true;
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            temp = 1 + r.nextInt(500);
        }
        for (int i = 0; i < jug.size(); i++) {
            if (temp == jug.get(i).getID()) {

                p = false;
            } else {
                p = true;
            }
        }
        if (p = true) {
            ID = temp;
        }

        return ID;
    }
}
