package Ejercicio_1;

public class Coche extends Vehiculo implements {
    public Coche(String marca, String modelo, int ano, int numeroPuertas) {
        super(marca, modelo, ano);
        this.numeroPuertas = numeroPuertas;
    }

    int numeroPuertas;

}