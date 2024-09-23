package Ejercicio_1;

public class Main {
    public static void main(String[] args){
        Persona persona1 = new Persona("Ana");
        Persona persona2 = new Persona("Juan");

        Vehiculo coche1= new Coche("Toyota", "Corolla", 2020, 4);
        coche1.setPropietario("Juan");

        Vehiculo coche2= new Coche("Honda","Civic", 2021,4 );
        coche2.setPropietario("Ana");
        Vehiculo coche3=new Coche("Ford","Focus",2022,4);
        coche3.setPropietario(null);

        Vehiculo camion1= new Camion("Mercedes","Actros",2019,18);
        camion1.setPropietario("Juan");




    }
}