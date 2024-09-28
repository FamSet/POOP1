package poop4;

public class POOP4 {

    public static void main(String[] args) {

        // Crear e imprimir el primer punto (constructor por defecto)
        Punto punto = new Punto();
        punto.ImprimePunto();

        // Crear e imprimir el segundo punto (constructor con parámetros)
        Punto punto2 = new Punto(1, 2, "punto 2");
        punto2.ImprimePunto();

        // Modificar atributos del primer punto e imprimirlo de nuevo
        punto.x = 20;
        punto.y = 100;
        punto.nombre = "Punto1";
        punto.ImprimePunto();
        System.out.println(punto);  // Nota: imprimirá la referencia de objeto a menos que sobrescribas el método toString()

        // Crear e imprimir el primer perro (constructor por defecto)
        Perro perro = new Perro();
        perro.imprimirPerro();

        // Crear e imprimir el segundo perro (constructor con parámetros)
        Perro perro2 = new Perro("Cafe", "Lacio", 10, "Golden", 12);
        perro2.imprimirPerro();

        // Modificar atributos del primer perro e imprimirlo de nuevo
        perro.edad = 10;
        perro.raza = "Pastor Aleman";
        perro.tamaño = 10;
        perro.color = "Negro";
        perro.pelaje = "Lacio";
        perro.imprimirPerro();

        // Llamar a los métodos de acciones del segundo perro
        perro2.correr();
        perro2.comer();
        perro2.morder();
        perro2.saltar(1, 3, 4);
    }
}
