package lab3p2_diegocasco_davidlara;

public class Alumno {

    // Atributos
    private String nombre;
    private String identidad;
    private String Id;
    private int fechaNacimiento;

    // Constructor
    public Alumno(String nombre, String identidad, String Id, int fechaNacimiento) {
        this.Id = Id;
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getId() {
        return Id;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String toString() {
        return "Alumno{" + "Id=" + Id + '}';
    }

    public void setClase(Clase clase) {
        clase.setAlumno(this);
    }

    public static void setTipoT(Transporte transporte) {
        transporte.setTipoT(String.valueOf(transporte));
    }
    public static void getTipoT(Transporte transporte) {
        transporte.getTipoT();
    }

}
