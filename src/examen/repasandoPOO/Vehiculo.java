package examen.repasandoPOO;

public class Vehiculo {
    public static int getContador() {
        return contador;
    }

    private static int contador;

    public Vehiculo(String marca, String modelo, int ano) {
        this.ano = ano;
    }

    private int ano;

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    private String propietario;
}
