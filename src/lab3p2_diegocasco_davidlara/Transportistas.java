/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegocasco_davidlara;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class Transportistas {
    private int tiempoexp;
    private ArrayList<String> apodo;

    public int getTiempoexp() {
        return tiempoexp;
    }

    public void setTiempoexp(int tiempoexp) {
        this.tiempoexp = tiempoexp;
    }

    public ArrayList<String> getApodo() {
        return apodo;
    }

    public void setApodo(ArrayList<String> apodo) {
        this.apodo = apodo;
    }

    public Transportistas(int tiempoexp, ArrayList<String> apodo) {
        this.tiempoexp = tiempoexp;
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Transportistas{" + "tiempoexp=" + tiempoexp + ", apodo=" + apodo + '}';
    }
    
}
