package examen.repasandoPOO;

public class Coche extends Vehiculo {
    public Coche(String marca, String modelo, int ano, int numeroPuertas) {
        super(marca, modelo, ano);
        this.numeroPuertas = numeroPuertas;
    }

    int numeroPuertas;
}