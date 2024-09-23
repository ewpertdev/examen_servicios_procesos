package Ejercicio_1;

class Vehiculo {
    public static int getContador() {
        return contador;
    }

    private static int contador;
    String marca;
    String modelo;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    int año;

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    String propietario;
}

class Coche extends Vehiculo implements {
    public Coche(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    int numeroPuertas;

}

class Camion extends Vehiculo{
    public Camion(String marca, String modelo, int año, int capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    int capacidadCarga;

}

class Persona {
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    String nombre;

}

class Main {
    public static void main(String[] args){
        Persona persona1 = new Persona("Ana");
        Persona persona2 = new Persona("Juan");

        Vehiculo coche1= new Coche("Toyota");
        Vehiculo coche2= new Coche("Honda");
        Vehiculo coche3=new Coche("Ford");

        Vehiculo camion1= new Camion("Mercedes");




    }
}