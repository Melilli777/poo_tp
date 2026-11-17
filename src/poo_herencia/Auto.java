package poo_herencia;

public class Auto extends Vehiculo {
    public int cantPuertas;

    public Auto(String marca, String modelo, int cantPuertas) {
        super(marca, modelo);
        this.cantPuertas = cantPuertas;
    }


    
}
