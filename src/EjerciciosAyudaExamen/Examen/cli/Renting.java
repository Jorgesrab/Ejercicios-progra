package cli;

import EjerciciosAyudaExamen.Examen.modelos.Cliente;
import EjerciciosAyudaExamen.Examen.modelos.Empleado;
import EjerciciosAyudaExamen.Examen.modelos.Persona;
import EjerciciosAyudaExamen.Examen.modelos.Vehiculo;
import servicios.*;
import EjerciciosAyudaExamen.Examen.utiles.Constantes;
import EjerciciosAyudaExamen.Examen.utiles.Marca;

import java.util.Scanner;

public class Renting {

    public static void main(String[] args) {
        IServicio servicio = new Servicio();
        Scanner sc = new Scanner(System.in);
        cargarDatos(servicio);

        int opcion;
        do {
            mostrarMenuInicial();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    loginEmpleado(sc, servicio);
                }
                case 2 -> System.out.println(Constantes.MSG_DESPEDIDA);
                default -> System.out.println(Constantes.ERR_OPCION);
            }
        } while (opcion != 2);
    }

    private static void loginEmpleado(Scanner sc, IServicio servicio) {
        System.out.println(Constantes.MSG_USUARIO);
        String usuario = sc.nextLine();
        System.out.println(Constantes.INTRODUZCA_CONTRASENA);
        String contrasena = sc.nextLine();
        boolean loginCorrecto = false;
        if( servicio.existeEmpleado(usuario) ) {
            Empleado e = servicio.getEmpleado(usuario);
            if( e.getContrasenia().equals(contrasena)) {
                loginCorrecto = true;
                System.out.println(Constantes.MSG_LOGIN_OK);
                gestionRenting(sc, servicio);
            } else System.out.println(Constantes.ERR_CONTRASEÑA_INCORRECTA);
        } else System.out.println(Constantes.ERR_USUARIO_NO_EXISTE);
    }

    private static void cargarDatos(IServicio servicio){
        Vehiculo coche1 = new Vehiculo("1111AAA", Marca.Audi, "A5", "Negro", 200);
        Vehiculo coche2 = new Vehiculo("2222BBB", Marca.Seat, "Ibiza", "Gris", 100);
        Vehiculo coche3 = new Vehiculo("3333CCC", Marca.Ford, "Focus", "Azul", 75.50);
        Vehiculo coche4 = new Vehiculo("4444DDD", Marca.Volkswagen, "Polo", "Blanco", 60.50);
        servicio.addVehiculo(coche1);
        servicio.addVehiculo(coche2);
        servicio.addVehiculo(coche3);
        servicio.addVehiculo(coche4);

        Persona e1 = new Empleado("12345678A", "Ana Iglesias", "profesorAna");
        Persona c1 = new Cliente("11111111A", "Juan López", "Villanueva de la Cañada");
        Persona c2 = new Cliente("22222222C", "Marina Pinteño", "Cádiz");
        Persona c3 = new Cliente("33333333D", "Amanda Garcia", "Valladolid");
        Persona c4 = new Cliente("44444444E", "Rafael Caro", "Devon");
        Persona c5 = new Cliente("55555555F", "Manuel Ceballos", "Sanlúcar");
        servicio.addPersona(e1);
        servicio.addPersona(c1);
        servicio.addPersona(c2);
        servicio.addPersona(c3);
        servicio.addPersona(c4);
        servicio.addPersona(c5);

        //comprobar repetidos que no se mete
        servicio.addPersona(new Cliente("12345678A", "Ana ewwewr", "ewrwer"));
/*
        for (Persona per: servicio.().values()) {
            System.out.println(per.toString());
        }
        for (Vehiculo coche: servicio.getVehiculos()) {
            System.out.println(coche.toString());
        }
*/

    }
    private static void mostrarMenuInicial() {
        System.out.println("Menú principal. Login");
        System.out.println("=====================");
        System.out.println("1. Entrar");
        System.out.println("2. Salir");
    }

    private static void gestionRenting(Scanner sc, IServicio servicio) {
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> anyadirNuevoVehiculo(sc, servicio);
                case 2 -> eliminarVehiculo(sc, servicio);
                case 3 -> {
                    System.out.println("Lista de vehículos (marca)");
                    int i=0;
                    for( Vehiculo v: servicio.getVehiculosPorMarca()) {
                        System.out.println(v);
                        i++;
                    }
                    if(i==0) System.out.println(Constantes.MSG_LISTA_VACIA);
                }
                case 4 -> {
                    System.out.println("Vehículos alquilados(por matrícula)");
                    int i=0;
                    for( Vehiculo v: servicio.getVehiculosPorMatricula(true)) {
                        System.out.println(v);
                        i++;
                    }
                    if(i==0) System.out.println(Constantes.MSG_LISTA_VACIA);
                }
                case 5 -> {
                    int i=0;
                    for( Vehiculo v: servicio.getVehiculosPorMatricula(false)) {
                        System.out.println(v);
                        i++;
                    }
                    if(i==0) System.out.println(Constantes.MSG_LISTA_VACIA);
                }
                case 6 -> {
                    alquilarVehiculo(sc, servicio);
                }
                case 7 -> {
                    desAlquilarVehiculo(sc, servicio);
                }
                case 8 -> {
                    int i=0;
                    for(Persona p: servicio.obtenerClientes() ){
                        System.out.println(p);
                        i++;
                    }
                    if(i==0) System.out.println(Constantes.MSG_LISTA_VACIA);
                }
                case 9 -> System.out.println(Constantes.MSG_DESPEDIDA);
                default -> System.out.println(Constantes.ERR_OPCION);
            }
        } while (opcion != 9);

    }

    private static boolean anyadirNuevoVehiculo(Scanner sc, IServicio servicio) {
        System.out.println(Constantes.MSG_MATRICULA);
        String matricula = sc.nextLine();
        System.out.println("Introduce la marca");
        int i = 0;
        for(Marca marca: Marca.values()) {
            System.out.print(i + ". " + marca + ", ");
            i++;
        }
        String marca = sc.nextLine();
        System.out.println("Introduce el modelo");
        String modelo = sc.nextLine();
        System.out.println("Introduce el color");
        String color = sc.nextLine();
        System.out.println("Introduce el precio por día");
        int precioPorDia = sc.nextInt();
        sc.nextLine();
        Vehiculo vehiculo = new Vehiculo(matricula, Marca.valueOf(marca), modelo, color, precioPorDia);
        return servicio.addVehiculo(vehiculo);
    }
    private static boolean eliminarVehiculo(Scanner sc, IServicio servicio) {
        System.out.println(Constantes.MSG_MATRICULA);
        String matricula = sc.nextLine();
        return servicio.eliminarVehiculo(matricula);
    }

    private static boolean alquilarVehiculo(Scanner sc, IServicio servicio) {
        System.out.println(Constantes.MSG_MATRICULA);
        String matricula = sc.nextLine();
        System.out.println("Introduce DNI del cliente");
        String dni = sc.nextLine();
        System.out.println("Introduce el numero de días");
        int numDias = sc.nextInt();
        sc.nextLine();
        return servicio.alquilarVehiculo(matricula, dni, numDias );
    }

    private static boolean desAlquilarVehiculo(Scanner sc, IServicio servicio) {
        System.out.println(Constantes.MSG_MATRICULA);
        String matricula = sc.nextLine();
        return servicio.desAlquilarVehiculo(matricula);
    }

    private static void mostrarMenu(){
        System.out.println(Constantes.MSG_BIENVENIDA);
        System.out.println(Constantes.MSG_OPCIOINES);
        System.out.println(Constantes.MSG_ANIADIR_VEHICULO);
        System.out.println(Constantes.MSG_ELIMINAR_VEHICULO);
        System.out.println("3.- Mostrar Todos");
        System.out.println("4.- Mostrar Alquilados");
        System.out.println("5.- Mostrar No Alquilados");
        System.out.println("6.- Alquilar");
        System.out.println("7.- Desalquilar");
        System.out.println("8.- Mostrar clientes");
        System.out.println("9.- Salir");
        
    }
}
