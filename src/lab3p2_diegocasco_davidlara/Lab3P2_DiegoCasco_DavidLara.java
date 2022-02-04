/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegocasco_davidlara;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import static lab3p2_diegocasco_davidlara.Alumnos.*;
import static lab3p2_diegocasco_davidlara.Rutas.*;

/**
 *
 * @author dcasc
 */
public class Lab3P2_DiegoCasco_DavidLara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList transportistas = new ArrayList();
        int opcion=100;
        while(opcion !=0){
            opcion = Integer.parseInt(
            JOptionPane.showInputDialog(
            "0-Salir\n"
                    + "1-Crear clase\n"
                    + "2-Crear ruta\n"
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
            if(opcion ==1){
                String name=JOptionPane.showInputDialog("Ingrese el nombre del libro: ");
                String code=JOptionPane.showInputDialog("Ingrese el código del libro: ");
                registrarC(name, code);
            }if(opcion==2){
                String name=JOptionPane.showInputDialog("Ingrese el nombre de la ruta: ");
                int code= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada X de la ruta: "));
                int code2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada Y de la ruta: "));
                registrarR(name, code, code2);
            }if(opcion==3){
                String name=JOptionPane.showInputDialog("Ingrese el nombre del alumno: ");
                String Idt=JOptionPane.showInputDialog("Ingrese la identidad del alumno: ");
                String Id=JOptionPane.showInputDialog("Ingrese el Id del alumno: ");
                int fN= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del alumno: "));
                agregarAlumno(name, Idt, Id, fN);
            }if(opcion==4){
                String Id=JOptionPane.showInputDialog("Ingrese el Id del alumno: ");
                String code=JOptionPane.showInputDialog("Ingrese el código de la clase: ");
                agregarClaseA(Id, code);
            }if(opcion ==5){
                String nom=JOptionPane.showInputDialog("Ingrese el Apodo: ");
                int exp=Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese los anos de experiencia: "));
                transportistas.add(new Transportistas(exp,nom));
            }if(opcion==6){
                
            }if(opcion ==7){
                int opcionsim=0;
                while(opcionsim!=0){
                    opcionsim =Integer.parseInt(JOptionPane.showInputDialog(
                    "0-Salir\n"
                            + ""));
                }
            }if(opcion==8){
                imprimirClases();
            }if(opcion==9){
                mostrarRutas();
            }if (opcion==10){
                imprimirAlumnos();
            }if(opcion==11){
                String salida="";
                for(Object temp: transportistas){
                    if(temp instanceof Transportistas){
                        salida=""+transportistas.indexOf(temp)+" -"+ temp+"\n";
                    }
                }
                JOptionPane.showMessageDialog(null,salida);
            }if(opcion ==12){
                String salida = "";
                for (Object temp : transportistas) {
                    if (temp instanceof Transporte) {
                        salida = "" + transportistas.indexOf(temp) + " -" + temp + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);
            }
        }
    }

}
