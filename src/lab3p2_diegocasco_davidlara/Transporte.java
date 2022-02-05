package lab3p2_diegocasco_davidlara;

public class Transporte {
    // Atributos
    private boolean verificar = false;
    private String tipotransporte;
    private int asientos;
    private int parados;
    private int placa;
    private String color;

    // Constructor
    public  Transporte(String tipotransporte, int asientos, int parados, int placa, String color) {
        this.tipotransporte = tipotransporte;
        this.asientos = asientos;
        this.parados = parados;
        this.placa = placa;
        this.color = color;
    }

    public String getTipoT() {
        return tipotransporte;
    }

    public void setTipoT(String tipotransporte) {
        this.tipotransporte = tipotransporte;
    }

    public int getPlaca() {
        return placa;
    }

    public String toString() {
        return "Transporte" + "\n" + "Tipo de transporte: " + tipotransporte + "\n" + "Asientos: " + asientos +
                "\n" + "Parados: " + parados + "\n" + "Placa: " + placa + "\n" + "Color: " + color;
    }

}
