package Ejerciciotres;


public class Ejerciciotresamain {

	    public static void main(String[] args) {
	        // Crear instancia de Animal 1 con nombre "perro" y velocidad 50
	        Animal animal1 = new Animal("perro", 80);

	        // Crear instancia de Animal 2 con nombre "gato" (velocidad predeterminada a 0)
	        Animal animal2 = new Animal("gato");

	        // Imprimir las velocidades de los animales
	        System.out.println("El animal 1 tiene una velocidad de " + animal1.getVelocidad() + ".");
	        System.out.println("El animal 2 tiene una velocidad de " + animal2.getVelocidad() + ".");
	    }

	
	
}
