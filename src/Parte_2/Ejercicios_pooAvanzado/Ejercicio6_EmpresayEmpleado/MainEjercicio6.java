package Parte_2.Ejercicios_pooAvanzado.Ejercicio6_EmpresayEmpleado;

public class MainEjercicio6 {
    public static void main(String[] args) {

        Empresa E1 =new Empresa("Cepsa","v28746",845329345,"Madrid");
        Empresa E2 =new Empresa("BMW","v28712346",845329345,"Barcelona");

        Empleado empleado1 = new Empleado("peep","234826489b");
        Empleado empleado2 = new Empleado("Javi","928456274b",1500,50,834784,"Madrid");


        System.out.println(E1.mostrar());
        System.out.println("-----------------------------------------------");
        System.out.println(empleado1.mostrar());
        System.out.println("-----------------------------------------------");
        System.out.println(empleado2.mostrar());
        System.out.println("-----------------------------------------------");
        E1.añadirEmpleados(empleado1);
        E1.añadirEmpleados(empleado2);

        System.out.println(E1.mostrar());
        System.out.println("-----------------------------------------------");
        E1.mostrarEmpleados();
        E1.mostrarEmpleadosSueldo();
        System.out.println("-----------------------------------------------");
        E1.eliminarEmpleados(empleado1);
        E1.mostrarEmpleadosSueldo();
    }
}
