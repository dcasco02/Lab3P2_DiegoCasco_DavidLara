package lab3p2_diegocasco_davidlara;

import java.util.ArrayList;

public class Transportes extends Alumnos {

    // Atributos
    private static boolean verificador = false;
    private static ArrayList<Transporte> transportes = new ArrayList<>();

    // Métodos
    public static void verify(int placa) {
        if (!verificador) {
            for (int i = 0; i < transportes.size(); i++) {
                if (transportes.get(i).getPlaca() == placa) {
                    verificador = true;
                    System.out.println("La placa ya existe");
                } else {
                    verificador = false;
                }
            }
        }
    }

    public static void defectoT() {
        String tipoT = "Bus";
        int asientos = 50;
        int parados = 10;
        int placa = 1554;
        String color = "Blanco";
        Transporte t = new Transporte(tipoT, asientos, parados, placa, color);
        transportes.add(t);
    }

    public static void agregarT(String tipoT, int asientos, int parados, int placa, String color) {
        verify(placa);
        if (!verificador) {
            Transporte t = new Transporte(tipoT, asientos, parados, placa, color);
            transportes.add(t);
        }
    }

    public static void agregarTransporteA(String Id, String tipoT) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getId().equals(Id)) {
                for (int j = 0; j < clases.size(); j++) {
                    if (transportes.get(j).getTipoT().equals(tipoT)) {
                        Alumno.setTipoT(transportes.get(j));
                    }
                }
            }
        }
    }

    public static void mostrarT() {
        for (int i = 0; i < transportes.size(); i++) {
            System.out.println(transportes.get(i).toString());
        }
    }

    public static void imprimirA() {
        for (int i = 0; i < transportes.size(); i++) {
            System.out.println(transportes.get(i).toString() + "\n" + alumnos.get(i).toString());
        }
    }


}
