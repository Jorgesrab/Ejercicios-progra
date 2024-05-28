package EjerciciosAyudaExamen.Concesionario.cli;

import cochesHM.modelo.Coche;
import cochesHM.servicios.*;
import cochesHM.utiles.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  CocheServices servicio = new CocheServices();
        ICocheServicios servicio = new CocheServiciosHM();
        cargaDatos(servicio);
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Selecciona una opción");
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    //buscar coche por matrícula
                    String matricula = pedirMatricula(sc);
                    Coche coche = servicio.buscarCochePorMatricula(matricula);
                    if (coche != null) {
                        System.out.println(servicio.buscarCochePorMatricula(matricula).toString());
                    } else {
                        System.out.println(Constantes.COCHE_NO_ESTA);
                    }
                    break;
                case 2:
                    //eliminar coche
                    matricula = pedirMatricula(sc);
                    if (servicio.eliminarCoche(matricula)) {
                        System.out.println(Constantes.COCHE_ELIMINADO_OK);
                    } else {
                        System.out.println(Constantes.COCHE_NO_ELIMINADO);
                    }
                    break;
                case 3:
                    //mostrar coches ordenados por su marca
                    System.out.println("Mostrando coches ordenados por marca");
                    for (Coche c : servicio.obtenerTodos(1)) {
                        System.out.println(c.toString());
                    }
                    break;
                case 4:
                    //mostrar coches ordenados por su matricula
                    System.out.println("Mostrando coches ordenados por matricula");
                    for (Coche c : servicio.obtenerTodos(2)) {
                        System.out.println(c.toString());
                    }
                    break;
                case 5:
                    System.out.println("Introduzca marca");
                    String marca = sc.nextLine();
                    System.out.println("Mostrando coches de la marca: " + marca);
                    for (Coche c : servicio.obtenerCochesMarca(marca)) {
                        System.out.println(c.toString());
                    }
                    break;
                case 6:
                    System.out.println(Constantes.MENSAJE_DESPEDIDA);
                    break;
                default:
                    System.out.println(Constantes.OPCION_INCORRECTA);
                    break;

            }
        } while (opcion != 6);
    }


    private static void menu() {
        System.out.println("BIENVENID@ A NUESTRA APLICACIÓN");
        //System.out.println("\t1. Añadir coche");
        System.out.println("\t1. Buscar coche por matrícula.");
        System.out.println("\t2. Eliminar coche");
        System.out.println("\t3. Mostrar todos los coches (ordenados por su marca).");
        System.out.println("\t4. Mostrar todos los coches (ordenados por su matrícula).");
        System.out.println("\t5. Mostrar todos los coches de una marca.");
        System.out.println("\t6. Salir.");
    }
    private static String pedirMatricula(Scanner sc) {
        System.out.println("Introduzca matricula del coche a buscar");
        String matricula = sc.nextLine();
        return matricula;
    }

    //private static void cargaDatos(CocheServices servicio) {
    private static void cargaDatos(ICocheServicios servicio) {
        Coche coche1 = new Coche("Negro", Marcas.Porsche.toString(), "Panamera", "1111ABC", 3  );
        Coche coche2 = new Coche("Azul", Marcas.Audi.name(), "A4", "2222ABC", 5  );
        Coche coche3 = new Coche("Rojo", Marcas.Audi.name(), "A3", "3333ABC", 5  );
        Coche coche4 = new Coche("Negro", Marcas.Audi.name(), "A5", "44444ABC", 3  );
        Coche coche5 = new Coche("Blanco", Marcas.Audi.name(), "Q5", "5555ABC", 5  );
        Coche coche6 = new Coche("Gris", Marcas.Audi.name(), "Q3", "6666ABC", 5  );
        Coche coche7 = new Coche("Negro", Marcas.Audi.name(), "A1", "7777ABC", 3  );
        Coche coche8 = new Coche("Plata", Marcas.Mercedes.name(), "CLK", "8888ABC", 5  );
        Coche coche9 = new Coche("Azul", Marcas.Mercedes.name(), "ClaseA", "9999ABC", 3  );
        Coche coche10 = new Coche("Plata", Marcas.BMW.name(), "Serie3", "1234BBB", 3  );
        Coche coche11 = new Coche("Negro", Marcas.BMW.name(), "X5", "1234CCC", 5  );
        Coche coche12 = new Coche("Rojo", Marcas.Ferrari.name(), "F8", "1234DDD", 3  );

        servicio.anadirCoche(coche1);
        servicio.anadirCoche(coche2);
        servicio.anadirCoche(coche3);
        servicio.anadirCoche(coche4);
        servicio.anadirCoche(coche5);
        servicio.anadirCoche(coche6);
        servicio.anadirCoche(coche7);
        servicio.anadirCoche(coche8);
        servicio.anadirCoche(coche9);
        servicio.anadirCoche(coche10);
        servicio.anadirCoche(coche11);
        servicio.anadirCoche(coche12);
    }

}
