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
public class Jugadores {
    private String usuario;
    private int ID;
    private String contra;
    private String p;

    public Jugadores() {
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public Jugadores(String usuario, int ID, String contra, String p) {
        this.usuario = usuario;
        this.ID = ID;
        this.contra = contra;
        this.p = p;
    }

    public Jugadores(String usuario, int ID, String contra) {
        this.usuario = usuario;
        this.ID = ID;
        this.contra = contra;
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

    @Override
    public String toString() {
        return "Jugadores{" + "usuario=" + usuario + ", ID=" + ID + ", contra=" + contra + '}';
    }
    
         
      
        
    }

