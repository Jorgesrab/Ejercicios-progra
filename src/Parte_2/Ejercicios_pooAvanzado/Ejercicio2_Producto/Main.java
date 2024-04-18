package Parte_2.Ejercicios_pooAvanzado.Ejercicio2_Producto;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Platano",6);
        Producto producto2 = new Producto("Melon",3);
        Producto producto3 = new Producto("Leche",7);
        Producto producto4 = new Producto("Carne",12);
        Producto producto5 = new Producto("pescado",2);

        ArrayList<Producto> Productos = new ArrayList<Producto>();
        Productos.add(producto1);
        Productos.add(producto2);
        Productos.add(producto3);
        Productos.add(producto4);
        Productos.add(producto5);

        Iterator<Producto> iterador = Productos.iterator();
        while (iterador.hasNext()){
            Producto producto =iterador.next();
            System.out.println(producto.nombre);
        }

        Productos.remove(2);
        Productos.remove(1);

        Producto productoNuevo = new Producto("Patatas",20);
        Productos.add(2,productoNuevo);
        System.out.println("----------------------------------------");
        for (Producto p:Productos) {
            System.out.println(p.nombre);

        }

        Productos.clear();
        System.out.println("----------------------------------------");
        for (Producto p:Productos) {
            System.out.println(p.nombre);

        }



    }
}
