package Parte_2.coleciones;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<String>();

        muestraColores(al);

        al.add("amarillo");
        al.add("azul");
        al.add("verde");
        al.add("negro");
        muestraColores(al);

        eliminarElemento("lila",al);
        eliminarElemento("negro",al);
        muestraColores(al);


        System.out.println(al.get(0));
        System.out.println(al.get(al.size()-1));
        System.out.println("------------------------------------------------------");
        al.forEach(System.out::println);

    }


    private static void muestraColores(ArrayList<String> al) {
        if (al.isEmpty()) {
            System.out.println("El ArrayList está vacío");
        } else {
            System.out.println("Contenido del ArrayList: " + al);
        }
    }

    private static void eliminarElemento(String color, ArrayList<String> al) {
        int index = al.indexOf(color);
        if (index != -1) {
            al.remove(index);
            System.out.println("Color " + color + " eliminado en la posición " + index);
        } else {
            System.out.println("Color " + color + " no encontrado");
        }
    }
}
