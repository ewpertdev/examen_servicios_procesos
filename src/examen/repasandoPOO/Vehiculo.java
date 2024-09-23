package examen.repasandoPOO;

public class Vehiculo {
    public static int getContador() {
        return contador;
    }

    private static int contador;

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
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
