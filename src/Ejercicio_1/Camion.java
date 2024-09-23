package Ejercicio_1;

public class Camion extends Vehiculo{
    public Camion(String marca, String modelo, int ano, int capacidadCarga) {
        super(marca, modelo, ano);
        this.capacidadCarga = capacidadCarga;
    }

    int capacidadCarga;

}
