package poop5;

public class POOP5 {

    public static void main(String[] args) {

        // Creación de un objeto Circulo y uso de sus métodos
        Circulo circulo = new Circulo();
        System.out.println("Radio inicial: " + circulo.getRadio());
        circulo.setRadio(4f);
        System.out.println("Radio actualizado: " + circulo.getRadio());
        
        // Cálculo del área y perímetro del círculo
        circulo.calcularArea();
        circulo.calcularPerimetro();

        System.out.println("###############");

        // Creación de objetos Persona para los pasajeros del coche
        Persona chofer = new Persona();
        chofer.setEdad(45);
        chofer.setAltura(1.80f);
        chofer.setNombre("Carlos");
        chofer.setOcupacion("Chofer");

        Persona copiloto = new Persona();
        copiloto.setEdad(32);
        copiloto.setAltura(1.70f);
        copiloto.setNombre("Luis");
        copiloto.setOcupacion("Copiloto");

        Persona pasajero1 = new Persona();
        pasajero1.setEdad(28);
        pasajero1.setAltura(1.65f);
        pasajero1.setNombre("Ana");
        pasajero1.setOcupacion("Pasajero1");

        Persona pasajero2 = new Persona();
        pasajero2.setEdad(22);
        pasajero2.setAltura(1.75f);
        pasajero2.setNombre("Maria");
        pasajero2.setOcupacion("Pasajero2");

        // Creación de un objeto Coche con los pasajeros
        Coche coche = new Coche(chofer, copiloto, pasajero1, pasajero2);
        coche.mostrarPosiciones();
    }
}
