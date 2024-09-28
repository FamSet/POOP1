package poop4;

public class Perro {
    // Atributos
    String color;
    String pelaje;
    int tamaño;
    String raza;
    int edad;

    // Constructor por defecto
    public Perro() {
        this.color = null;
        this.pelaje = null;
        this.tamaño = 0;
        this.raza = null;
        this.edad = 0;
    }

    // Constructor con parámetros
    public Perro(String color, String pelaje, int tamaño, String raza, int edad) {
        this.color = color;
        this.pelaje = pelaje;
        this.tamaño = tamaño;
        this.raza = raza;
        this.edad = edad;
    }

    // Método para imprimir la información del perro
    public void imprimirPerro() {
        System.out.println("Color: " + color + " Pelaje: " + pelaje + " Tamaño: " + tamaño + " Raza: " + raza + " Edad: " + edad);
    }

    // Método para simular que el perro está jugando
    public void jugar() {
        System.out.println("Guau Guau");
    }

    // Método para simular que el perro está comiendo
    public boolean comer() {
        System.out.println("Mmmmmmmmm");
        return true;
    }

    // Método para simular que el perro está corriendo
    public void correr() {
        System.out.println("Fast as fuck boyyyyyyyyy");
    }

    // Método para simular que el perro está mordiendo
    public void morder() {
        System.out.println("Grrrrrrr");
    }

    // Método para simular que el perro está saltando
    public void saltar(float x, float y, float z) {
        System.out.println("x = " + x + " y = " + y + " z = " + z);
    }
}
