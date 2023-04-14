package Ejerciciotres;

public class Animal {
    private String nombre;
    private int velocidad;

    // Constructor con nombre y velocidad
    public Animal(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    // Constructor con solo nombre (velocidad predeterminada a 0)
    public Animal(String nombre) {
        this(nombre, 0);
    }

    // Método para obtener la velocidad
    public int getVelocidad() {
        return velocidad;
    }
}
