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
public class Transporte {
    private String tipotransporte;
    private int asientos;
    private int parados;
    private int placa;

    public String getTipotransporte() {
        return tipotransporte;
    }

    public void setTipotransporte(String tipotransporte) {
        this.tipotransporte = tipotransporte;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getParados() {
        return parados;
    }

    public void setParados(int parados) {
        this.parados = parados;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Transporte{" + "tipotransporte=" + tipotransporte + ", asientos=" + asientos + ", parados=" + parados + ", placa=" + placa + '}';
    }
    
}
