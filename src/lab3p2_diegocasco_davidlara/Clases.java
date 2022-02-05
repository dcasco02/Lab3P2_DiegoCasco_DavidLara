package lab3p2_diegocasco_davidlara;

import java.util.ArrayList;

public class Clases {

    // Atributos
    private static boolean verificador = false;
    public static ArrayList<Clase> clases = new ArrayList<>();

    // Métodos

    public static void verify(String codigo) {
        for (int i = 0; i < clases.size(); i++) {
            if (clases.get(i).getCodigo().equals(codigo)) {
                verificador = true;
                System.out.println("Ya existe una clase con ese código");
            } else {
                verificador = false;
            }
        }
    }

    public static void defectC() {
        String codigo = "123";
        String nombre = "Programación";
    }

    public static void registrarC(String nombre, String codigo) {
        verify(codigo);
        if (!verificador) {
            Clase clase = new Clase(nombre, codigo);
            clases.add(clase);
        } else {
            System.out.println("Ya existe una clase con ese código");
        }
    }

    public static void imprimirClases() {
        for (Clase clase : clases) {
            System.out.println(clase.toString());
        }
    }
}
