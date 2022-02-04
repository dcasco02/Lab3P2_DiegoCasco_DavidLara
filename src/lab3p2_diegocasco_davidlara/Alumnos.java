package lab3p2_diegocasco_davidlara;

import java.util.ArrayList;

public class Alumnos extends Clases{

    // Atributos
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static boolean verificar = false;

    // Métodos

    public static void verify(String Id) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getId().equals(Id)) {
                System.out.println("El alumno ya está registrado");
                verificar = true;
            } else {
                verificar = false;
            }
        }
    }

    public static void agregarAlumno(String Id) {
        verify(Id);
        if (!verificar) {
            Alumno alumno = new Alumno(Id);
            alumnos.add(alumno);
        } else {
            System.out.println("El alumno ya está registrado");
        }
    }

    public static void imprimirAlumnos(){
        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < clases.size(); j++) {
                System.out.println(" Id Alumno: " + alumnos.get(i).getId() + " " + " Clases del alumno: " + clases.get(j).getNombre());
                }
            }
    }
}
