package Parte_2.Ejercicios_pooAvanzado.Ejercicio4_Mascotas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Perro p1 = new Perro("Bobby", 5, "jugando", "Feb-2015", "Pastor alemán", false);
        Perro p2 = new Perro("Lulu", 7, "durmiendo", "Abril-2013", "Rottweiler", false);
        Gato g1 = new Gato("Luna", 2, "durmiendo", "Sept-2018", "negro", false);
        Gato g2 = new Gato("Pecas", 2, "rascandose", "Julio-2018", "blanco", true);
        Loro l1 = new Loro("Arturito", 10, "hablando", "Enero-2010", "largo", true, "Murcia", true);
        Canario c1 = new Canario("Basilio", 5, "piando", "Dic-2015", "corto", true, "amarillo", true);

        ArrayList<Mascotas> animales = new ArrayList<Mascotas>();
        animales.add(p1);
        animales.add(p2);
        animales.add(g1);
        animales.add(g2);
        animales.add(l1);
        animales.add(c1);

        System.out.println("Lista de animales:");

        int aux=0;
        for (Mascotas element : animales) {

            aux+=1;


            System.out.println(aux+". "+element.getNombre() + " " + element.getClass().getSimpleName());


        }
        System.out.println("Seleccione el animal que desea mostrar ");
        int auxMostrar = entrada.nextInt()-1;

        animales.get(auxMostrar).muestra();


        System.out.println("---------------------------------------\n Todos los animales");

        for (Mascotas elementos : animales) {
            elementos.muestra();
            
        }








    }



}
