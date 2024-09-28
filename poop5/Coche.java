package poop5;

public class Coche {
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;

    // Constructor con los 4 pasajeros
    public Coche(Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }

    // Método para mostrar las posiciones de los pasajeros en el coche
    public void mostrarPosiciones() {
        System.out.println(chofer.getNombre() + " está en el lugar de " + chofer.getOcupacion());
        System.out.println(copiloto.getNombre() + " está en el lugar de " + copiloto.getOcupacion());
        System.out.println(pasajero1.getNombre() + " está en el lugar de " + pasajero1.getOcupacion());
        System.out.println(pasajero2.getNombre() + " está en el lugar de " + pasajero2.getOcupacion());
    }
}
