package lab3p2_diegocasco_davidlara;

import java.util.ArrayList;

public class Alumnos extends Clases {

    // Atributos
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static boolean verificar = false;

    // Métodos
    public static void verify(String Id, String identidad) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getId().equals(Id) && alumnos.get(i).getIdentidad().equals(identidad)) {
                System.out.println("El alumno ya está registrado");
                verificar = true;
            } else {
                verificar = false;
            }
        }
    }

    public static void defectoA() {
        String nombre = "WTF";
        String identidad = "WTF21";
        int fechaNacimiento = 10/5/2000;
        String Id = "W2321";
       Alumno alumno = new Alumno(nombre, identidad, Id, fechaNacimiento);
       alumnos.add(alumno);
    }

    public static void agregarAlumno(String nombre, String identidad, String Id, int fechaNacimiento) {
        verify(Id, identidad);
        if (!verificar) {
            Alumno alumno = new Alumno(nombre, identidad, Id, fechaNacimiento);
            alumnos.add(alumno);
        } else {
            System.out.println("El alumno ya está registrado");
        }
    }

    public static void agregarClaseA(String Id, String nombre) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getId().equals(Id)) {
                for (int j = 0; j < clases.size(); j++) {
                    if (clases.get(j).getNombre().equals(nombre)) {
                        alumnos.get(i).setClase(clases.get(j));
                    }
                }
            }
        }
    }

    public static void imprimirAlumnos() {
        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < clases.size(); j++) {
                System.out.println(" Id Alumno: " + alumnos.get(i).getId() + " " + " Clases del alumno: " + clases.get(j).getNombre());
            }
        }
    }
}
