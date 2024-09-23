package Ejercicio_1;

class Vehiculo {
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

class Coche extends Vehiculo implements {
    public Coche(String marca, String modelo, int ano, int numeroPuertas) {
        super(marca, modelo, ano);
        this.numeroPuertas = numeroPuertas;
    }

    int numeroPuertas;

}

class Camion extends Vehiculo{
    public Camion(String marca, String modelo, int ano, int capacidadCarga) {
        super(marca, modelo, ano);
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
        coche1.setPropietario("Juan");
        coche1.modelo("Corolla");

        Vehiculo coche2= new Coche("Honda");
        coche2.setPropietario("Ana");
        Vehiculo coche3=new Coche("Ford");
        coche3.setPropietario(null);

        Vehiculo camion1= new Camion("Mercedes");
        camion1.setPropietario("Juan");




    }
}