package lab3p2_diegocasco_davidlara;

import java.util.Arrays;

public class Ruta {

    // Atributos
    private String nombre;
    private String [][] coordenadas = new String[20][20];

    // Constructor
    public Ruta(String nombre, int x, int y){
        this.nombre = nombre;
        coordenadas[x][y] = coordenadas[x][y];
    }


    public String getNombre(){
        return nombre;
    }

    public String[][] getCoordenadas(){
        for (int i = 0; i < coordenadas.length; i++) {
            for (int j = 0; j < coordenadas[i].length; j++) {
                if (coordenadas[i][j] != null) {
                    System.out.print(coordenadas[i][j] + "\t");
                }
            }
        }
        return coordenadas;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCoordenadas(String[][] coordenadas){
        this.coordenadas = coordenadas;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nCoordenadas: " + getCoordenadas();
    }
}
