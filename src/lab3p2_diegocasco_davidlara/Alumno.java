package lab3p2_diegocasco_davidlara;

public class Alumno {

    // Atributos
    private String Id;

    // Constructor
    public Alumno(String Id) {
        this.Id = Id;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String toString() {
        return "Alumno{" + "Id=" + Id + '}';
    }

}
