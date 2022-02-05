/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegocasco_davidlara;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import static lab3p2_diegocasco_davidlara.Alumnos.*;
import static lab3p2_diegocasco_davidlara.Estaciones.*;
import static lab3p2_diegocasco_davidlara.Transportes.*;
import static lab3p2_diegocasco_davidlara.Transportistas.*;

/**
 * @author dcasc
 */
public class Lab3P2_DiegoCasco_DavidLara {


    public static void destruccion() {
        ArrayList<Transporte> transportes = new ArrayList<>();
        ArrayList<Transportista> transportistas = new ArrayList<>();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Estacion> estaciones = new ArrayList<>();
        transportes.clear();
        System.out.println("Se han destruido los transportes con C4");
        transportistas.clear();
        System.out.println("Los transportistas han muerto por la detonación del C4");
        alumnos.clear();
        System.out.println("Los alumnos han sido destrozados por la detonación del C4");
        estaciones.clear();
        System.out.println("Las estaciones han sido destruidas por diferentes detonaciones de cargas de C4");
        System.exit(0);
    }


    public static void main(String[] args) {

        // Atributos de la clase
        ArrayList transportistas = new ArrayList();
        int opcion = 100;
        int opcion2;

        defectoT();
        defectoE();
        defectoA();
        defectC();
        defectoTran();

        while (opcion != 0) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "0-Salir\n"
                                    + "1-Crear clase\n"
                                    + "2-Crear estación\n"
                                    + "3-Crear alumno\n"
                                    + "4-Agregar alumno a clase\n"
                                    + "5-Crear Transportista\n"
                                    + "6-Crear Transporte\n"
                                    + "7- Simulación\n"
                                    + "8-Listar Clases\n"
                                    + "9-Listar Rutas\n"
                                    + "10-Listar Alumnos\n"
                                    + "11-Listar Transportistas\n"
                                    + "12-Listar Transportes"));
            if (opcion == 1) {
                String name = JOptionPane.showInputDialog("Ingrese el nombre del libro: ");
                String code = JOptionPane.showInputDialog("Ingrese el código del libro: ");
                registrarC(name, code);
            }
            if (opcion == 2) {
                String name = JOptionPane.showInputDialog("Ingrese el nombre de la ruta: ");
                int code = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada X de la ruta: "));
                int code2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada Y de la ruta: "));
                registrarE(name, code, code2);
            }
            if (opcion == 3) {
                String name = JOptionPane.showInputDialog("Ingrese el nombre del alumno: ");
                String Idt = JOptionPane.showInputDialog("Ingrese la identidad del alumno: ");
                String Id = JOptionPane.showInputDialog("Ingrese el Id del alumno: ");
                int fN = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del alumno: "));
                agregarAlumno(name, Idt, Id, fN);
            }
            if (opcion == 4) {
                String Id = JOptionPane.showInputDialog("Ingrese el Id del alumno: ");
                String code = JOptionPane.showInputDialog("Ingrese el código de la clase: ");
                agregarClaseA(Id, code);
            }
            if (opcion == 5) {
                String name = JOptionPane.showInputDialog("Ingrese el nombre del transportista: ");
                String Idt = JOptionPane.showInputDialog("Ingrese la identidad del transportista: ");
                int exp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la experiencia del transportista: "));
                String apodo = JOptionPane.showInputDialog("Ingrese el apodo del transportista: ");
                int fecha = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del transportista: "));
                addTransportista(exp, Idt, name, apodo, fecha);
            }
            if (opcion == 6) {
                String tipotransporte = JOptionPane.showInputDialog("Ingrese el tipo de transporte: ");
                int asientos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asientos: "));
                int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del transporte: "));
                int placa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la placa del transporte: "));
                String color = JOptionPane.showInputDialog("Ingrese el color del transporte: ");
                agregarT(tipotransporte, asientos, capacidad, placa, color);
            }
            if (opcion == 7) {
                do {
                    opcion2 = Integer.parseInt
                            (JOptionPane.showInputDialog("""
                            0-Salir
                            1-Subir Alumno
                            2-listar Alumnos
                            3-Escoger Transportista
                            4-Añadir ruta
                            5-Imprimir Transporte
                            6-Destruir Transporte
                            seleccione una opción:"""));
                    if (opcion2 == 1) {
                        String Id = JOptionPane.showInputDialog("Ingrese el Id del alumno: ");
                        String tipoT = JOptionPane.showInputDialog("Ingrese el tipo de transporte: ");
                        agregarTransporteA(Id,tipoT);
                    } else if (opcion2 == 2) {
                        imprimirA();
                    } else if (opcion2 == 3) {
                        String apodo = JOptionPane.showInputDialog("Ingrese el apodo del transportista: ");
                        setTransportista(apodo);
                    } else if (opcion2 == 4) {
                        String nombreE = JOptionPane.showInputDialog("Ingrese el nombre de la Estación: ");
                        imprimirEst(nombreE);
                    } else if (opcion2 == 5) {
                        imprimirA();
                        System.out.println(imprimirTrans());
                        mostrarT();
                    } else if (opcion2 == 6) {
                        System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡Iniciando destrucción masiva!!!!!!!!!!!!");
                        destruccion();
                    }
                } while (opcion2 != 0);
            }
            if (opcion == 8) {
                imprimirClases();
            }
            if (opcion == 9) {
                imprimirEst();
            }
            if (opcion == 10) {
                imprimirAlumnos();
            }
            if (opcion == 11) {
                imprimirTransportistas();
                if (opcion == 12) {
                    mostrarT();
                }
            }
        }
    }
}
