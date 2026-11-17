package poo_herencia;

public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        setSalario(salario);
    }

    public double getSalario() { return salario; }

    public void setSalario(double salario) {

        this.salario = salario;
    }


}