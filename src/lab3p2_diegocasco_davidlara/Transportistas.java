/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegocasco_davidlara;

/**
 *
 * @author dcasc
 */
public class Transportistas {
    private int tiempoexp;
    private String apodo;

    public int getTiempoexp() {
        return tiempoexp;
    }

    public void setTiempoexp(int tiempoexp) {
        this.tiempoexp = tiempoexp;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Transportistas(int tiempoexp, String apodo) {
        this.tiempoexp = tiempoexp;
        this.apodo = apodo;
    }
    
}