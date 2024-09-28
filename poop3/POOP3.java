package poop3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.text.SimpleDateFormat;

public class POOP3 {

    public static void main(String[] args) {

        // Arreglos
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums4 = new int[5];

        // For-each para imprimir elementos de nums2
        System.out.println("####### for each #######");
        for (int temp : nums2) {
            System.out.println("Cuenta: " + temp);
        }

        // For tradicional para llenar e imprimir nums4
        System.out.println("######### for #########");
        for (int i = 0; i < nums4.length; i++) {
            nums4[i] = i * 10;
        }

        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }

        // Manipulación de cadenas
        System.out.println("###### string ######");
        String cadena = new String("Hola mundo"); // Cadena canónica
        System.out.println(cadena);

        String cadena1 = "Hola mundo de forma recomendada"; // Cadena recomendada
        System.out.println(cadena1);

        String nombre = "Jorge";
        String apellido = "Rodriguez";
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombre + " " + apellido);
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);

        // Wrapper classes
        System.out.println("####### wrapper ######");
        int a = 4;
        Integer b = new Integer(4); // No es recomendable, se usa solo para ejemplos antiguos
        System.out.println(b);
        Integer c = 4; // Autoboxing
        System.out.println(c);
        Integer d = a; // Autoboxing
        String cadena3 = d.toString();
        String cadena4 = 4 + ""; // Conversión rápida
        System.out.println(cadena3);
        System.out.println(cadena4);

        // Colecciones
        System.out.println("###### colecciones ######");
        System.out.println("###### ArrayList ######");

        // ArrayList
        ArrayList<Integer> miArrayList = new ArrayList<>();
        miArrayList.add(d);
        miArrayList.add(33);
        miArrayList.add(77);

        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(1, 10); // Añadir en la posición 1

        System.out.println(miArrayList.size());
        System.out.println("***");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }

        miArrayList.add(77); // Añadir otro 77
        System.out.println("***");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        System.out.println("Nuevo tamaño " + miArrayList.size());

        // Hashtable
        System.out.println("####### Hashtable #######");

        Hashtable<Integer, String> miTabla = new Hashtable<>();
        miTabla.put(1, "uno");
        miTabla.put(55991, "Antonio");
        miTabla.put(98096, "Diana");
        System.out.println("Elementos en tabla: " + miTabla.size());

        // Enumerador de llaves en Hashtable
        System.out.println("####### Enumerador ######");
        Integer llave;
        String valor;

        Enumeration<Integer> enumeradorLlaves = miTabla.keys();
        while (enumeradorLlaves.hasMoreElements()) {
            llave = enumeradorLlaves.nextElement();
            valor = miTabla.get(llave);
            System.out.println(llave + " " + valor);
        }

        // Diccionario con Hashtable
        System.out.println("####### Diccionario con Hashtable #######");

        Hashtable<String, String> diccionario = new Hashtable<>();
        diccionario.put("Java", "Lenguaje de programación.");
        diccionario.put("Hashtable", "Estructura de datos que mapea claves a valores.");
        diccionario.put("Programación", "Proceso de escribir código fuente.");
        diccionario.put("Clase", "Plantilla para crear objetos.");
        diccionario.put("Método", "Función asociada a una clase.");

        Enumeration<String> claves = diccionario.keys();
        while (claves.hasMoreElements()) {
            String clave = claves.nextElement();
            String valorDiccionario = diccionario.get(clave);
            System.out.println(clave + ": " + valorDiccionario);
        }

        // Agenda con Hashtable y Calendar
        System.out.println("####### Agenda con Hashtable y Calendar #######");

        Hashtable<String, Calendar> agenda = new Hashtable<>();

        Calendar cumpleaños1 = Calendar.getInstance();
        cumpleaños1.set(1990, Calendar.JANUARY, 15);
        agenda.put("Ana", cumpleaños1);

        Calendar cumpleaños2 = Calendar.getInstance();
        cumpleaños2.set(1985, Calendar.MAY, 22);
        agenda.put("Luis", cumpleaños2);

        Calendar cumpleaños3 = Calendar.getInstance();
        cumpleaños3.set(2000, Calendar.AUGUST, 30);
        agenda.put("María", cumpleaños3);

        Calendar cumpleaños4 = Calendar.getInstance();
        cumpleaños4.set(1975, Calendar.OCTOBER, 10);
        agenda.put("Pedro", cumpleaños4);

        Calendar cumpleaños5 = Calendar.getInstance();
        cumpleaños5.set(1992, Calendar.DECEMBER, 5);
        agenda.put("Laura", cumpleaños5);

        Enumeration<String> nombres = agenda.keys();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        while (nombres.hasMoreElements()) {
            String nombrePersona = nombres.nextElement();
            Calendar cumpleaños = agenda.get(nombrePersona);
            String fecha = formatoFecha.format(cumpleaños.getTime());
            System.out.println(nombrePersona + ": " + fecha);
        }
    }
}
