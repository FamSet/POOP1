package poop2;

/**
 * @author antonioayala
 */
public class POOP2 {
    
    public static void main(String[] args) {
        // Imprimir "Hola mundo"
        System.out.println("Hola mundo");
        System.err.println("Hola");

        // Estructura if-else
        System.out.println("############## if ##############");
        int a = 15;
        int b = 10;
        
        if (a < b) {
            System.out.println("a es menor que b");
        } else if (a == b) {
            System.out.println("a es igual a b");
        } else {
            System.out.println("a es mayor que b");
        }

        // Uso de método menor
        System.out.println("############## if ##############");
        if (menor(a, b)) {
            System.out.println("metodo menor retorna true");
        } else {
            System.out.println("metodo menor retorna false");
        }

        // Switch para días de la semana
        System.out.println("############## Switch ##############");
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Día incorrecto");
        }

        // Switch para vocales
        System.out.println("############## Switch ##############");
        char vocal = '9';
        switch (vocal) {
            case 'a':
                System.out.println("Seleccionó vocal a");
                break;
            case 'e':
                System.out.println("Seleccionó vocal e");
                break;
            case 'i':
                System.out.println("Seleccionó vocal i");
                break;
            case 'o':
                System.out.println("Seleccionó vocal o");
                break;
            case 'u':
                System.out.println("Seleccionó vocal u");
                break;
            default:
                System.out.println("No se seleccionó una vocal");
        }

        // Ciclo While
        System.out.println("############## While ##############");
        int n = 0;
        while (n < 10) {
            System.out.println("Contando hacia arriba n=" + n);
            n++;
        }

        while (n > 0) {
            System.out.println("Contando hacia abajo n=" + n);
            n--;
        }
        System.out.println("n=" + n);

        // Ciclo Do-While
        System.out.println("############## Do-While ##############");
        do {
            System.out.println("Contando hacia abajo");
            n--;
        } while (n > 0);
        System.out.println("n=" + n);

        // Ciclo For
        System.out.println("############## For ##############");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba " + i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo " + i);
        }

        // Arrays
        System.out.println("############## For ##############");
        int[] miArreglo = {1, 2, 3, 4, 5};
        int numElementos = miArreglo.length;
        System.out.println("miArreglo tiene " + numElementos + " elementos");

        int[] miArreglo2 = new int[10];
        numElementos = miArreglo2.length;
        System.out.println("miArreglo2 tiene " + numElementos + " posiciones");

        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i * 10;
        }

        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo2[" + i + "]=" + miArreglo2[i]);
        }

        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje " + j + "%");
        }

        // For-each
        System.out.println("############## For-each ##############");
        for (int i : miArreglo2) {
            System.out.println("Hackeando la nasa " + i + "%");
        }
    }

    // Método menor
    private static boolean menor(int x, int y) {
        return x < y;
    }
}
