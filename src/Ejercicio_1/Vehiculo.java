package Ejercicio_1;

public class Vehiculo {
    public static int getContador() {
        return contador;
    }

    private static int contador;

    String marca;
    String modelo;

    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    int ano;

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    String propietario;
}
