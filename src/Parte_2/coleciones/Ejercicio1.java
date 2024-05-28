package Parte_2.coleciones;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        // a) declara un ArrayList de String
        ArrayList<String> al = new ArrayList<>();

        //b) llama al método muestraColores e impleméntalo.
        muestraColores(al);

        // c) Añade elementos al ArrayList
        al.add("amarillo");
        al.add("rojo");
        al.add("verde");
        al.add("azul");
        al.add("blanco");

        // d) vuelve a mostrar los colores
        muestraColores(al);

        // e) Mostrar el primer elemento
        System.out.println("El primer color es: " + al.get(0));

        // f) Mostrar el último elemento
        System.out.println("El último color es: " + al.get(al.size() - 1));

        // g) encontrar un elemento y borrarlo, por ejemplo el rojo
        eliminarElemento("rojo", al);

        // h) Mostrar el arrayList
        System.out.println("Array de colores después de eliminar 'rojo': " + al);

        // i) encontrar un elemento y borrarlo, por ejemplo el lila
        if (al.contains("lila")) {
            int posicion = al.indexOf("lila");
            al.remove(posicion);
            eliminarElemento("lila", al);
        } else {
            System.out.println("El color 'lila' no está en el array.");
        }

        // j) Mostrar el arrayList
        System.out.println("Array de colores después de eliminar 'lila': " + al);
    }

    private static void muestraColores(ArrayList<String> array) {
        if (array.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            for (String color : array) {
                System.out.print(color + " ");
            }
            System.out.println();
        }
    }

    private static void eliminarElemento(String color, ArrayList<String> al) {
        if (al.contains(color)) {
            int posicion = al.indexOf(color);
            al.remove(posicion);
            System.out.println("Se ha eliminado el color '" + color + "' en la posición " + posicion + ".");
        } else {
            System.out.println("El color no está en el array.");
        }
    }
}