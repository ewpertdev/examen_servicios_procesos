package Ejercicio_1;

class Vehiculo {
    private static int contador;
    String marca;
    String modelo;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    int año;
    String propietario;
}
