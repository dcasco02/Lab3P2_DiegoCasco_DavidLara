package lab3p2_diegocasco_davidlara;

import java.util.ArrayList;

public class Transportista {
    // Atributos
    private String nombre;
    private int tiempoexp;
    private String apodo;
    private String identidad;
    private int fechaN;

    public Transportista(int tiempoexp, String nombre, String apodo, String identidad, int fechaN) {
        this.tiempoexp = tiempoexp;
        this.apodo = apodo;
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaN = fechaN;
    }

    public String getIdentidad() {
        return identidad;
    }



    public String toString() {
        return "Transportista" + "\n" + "Nombre: " + nombre + "\n" + "Tiempo de experiencia: " + tiempoexp + "\n" +
                "Apodo: " + apodo + "\n" + "Identidad: " + identidad + "\n" + "Fecha de nacimiento: " + fechaN;
    }


    public String getApodo() {
        return apodo;
    }

    public String getNombre() {
        return nombre;
    }
}
