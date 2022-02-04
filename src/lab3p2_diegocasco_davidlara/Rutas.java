package lab3p2_diegocasco_davidlara;

import java.util.ArrayList;
import java.util.Arrays;

public class Rutas {

    // Atributos
    private static ArrayList<Ruta> rutas = new ArrayList<>();

    // Métodos
    public static void registrarR(String nombre ,int x, int y){
        Ruta ruta = new Ruta(nombre, x, y);
        rutas.add(ruta);
    }

    public static void mostrarRutas(){
        for (Ruta ruta : rutas) {
            System.out.println(ruta.toString());
        }
    }



}
