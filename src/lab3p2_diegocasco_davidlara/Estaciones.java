package lab3p2_diegocasco_davidlara;

import java.util.ArrayList;
import java.util.Scanner;

public class Estaciones {

    // Atributos
    static Scanner leer = new Scanner(System.in);
    private static ArrayList<Estacion> estaciones = new ArrayList<>();

    // Métodos
    public static void defectoE() {
        String nombre = "Estación A";
        int coordenadaX = 142;
        int coordenadaY = 234;
        registrarE(nombre, coordenadaX, coordenadaY);
    }

    public static void registrarE(String nombre, int coordenadaX, int coordenadaY) {
        Estacion estacion = new Estacion(nombre, coordenadaX, coordenadaY);
        estaciones.add(estacion);
    }

    public static void imprimirEst() {
        for (Estacion estacion : estaciones) {
            System.out.println(estacion.toString());
        }
    }

    public static void imprimirEst(String nombre) {
        for (Estacion estacion : estaciones) {
                if (estacion.getEstacion().equals(nombre)) {
                System.out.println(estacion.getEstacion());
            }
        }
    }

}
