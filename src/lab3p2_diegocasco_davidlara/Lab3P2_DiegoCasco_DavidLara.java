/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegocasco_davidlara;

import javax.swing.JOptionPane;

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
        int opcion=0;
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
                    + "7- Simulacion\n"
                    + "8-Listar Clases\n"
                    + "9-Listar Rutas\n"
                    + "10-Listar Alumnos\n"
                    + "11-Listar Transportistas\n"
                    + "12-Listar Transportes"));
            if(opcion ==1){
                
            }
        }
    }
    
}
