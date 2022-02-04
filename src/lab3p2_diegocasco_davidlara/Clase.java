package lab3p2_diegocasco_davidlara;

public class Clase {

    // Atributos
    private String nombre;
    private String codigo;

    // Constructor
    public Clase(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setAlumno(Alumno alumno) {
        alumno.setClase(this);
    }

    public String toString(){
        return "Clase: " + nombre + " - " + codigo;
    }


}

