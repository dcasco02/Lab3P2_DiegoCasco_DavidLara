package lab3p2_diegocasco_davidlara;

import java.util.ArrayList;

public class Transportistas {
    // Atributos
    private static boolean verificador = false;
    private static ArrayList<Transportista> transportistas = new ArrayList<>();
    private static String seleccionarT;


    // Métodos
    public static void verify(String identidad) {
        if (!verificador) {
            for (Transportista transportista : transportistas) {
                if (transportista.getIdentidad().equals(identidad)) {
                    verificador = true;
                    System.err.println("Ya existe un transportista con esa identidad");
                } else {
                    verificador = false;
                }
            }
        }
    }

    public static void defectoTran() {
        int exp = 2;
        String nombre = "Diego";
        String apodo = "D";
        String identidad = "123456789";
        int fechaN = 10 / 10 / 98;
        Transportista transportista = new Transportista(exp, nombre, apodo, identidad, fechaN);
        transportistas.add(transportista);
    }

    public static void addTransportista(int tiempoexp, String nombre, String apodo, String identidad, int fechaN) {
        verify(identidad);
        if (!verificador) {
            Transportista transportista = new Transportista(tiempoexp, nombre, apodo, identidad, fechaN);
            transportistas.add(transportista);
        }
    }

    public static void imprimirTransportistas() {
        for (Transportista transportista : transportistas) {
            System.out.println(transportista.toString());
        }
    }

    public static void setTransportista(String apodo) {
        for (Transportista transportista : transportistas) {
            if (transportista.getApodo().equals(apodo)) {
                seleccionarT = transportista.getNombre();
            }
        }
    }

    public static String imprimirTrans() {
        return seleccionarT;
    }

}
