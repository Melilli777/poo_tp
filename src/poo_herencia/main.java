package poo_herencia;

public class main {

	public static void main(String[] args) {
        System.out.println("1");
        Empleado e = new Empleado("Lucía", 28, 850000);
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Edad: " + e.getEdad());
        System.out.println("Salario: " + e.getSalario());
        
        System.out.println("2");
        Auto a = new Auto("Volkswagen", "Gol", 7);
        System.out.println("Marca: " + a.getMarca());
        System.out.println("Modelo: " + a.getModelo());
        System.out.println("Puertas: " + a.cantPuertas);

        System.out.println("3");
        Perro p = new Perro("rocco", 4, "Labrador");
        System.out.println("Nombre: " + p.nombre + ", Edad: " + p.edad + ", Raza: " + p.raza);
        p.ladrar();

       

	}

}
