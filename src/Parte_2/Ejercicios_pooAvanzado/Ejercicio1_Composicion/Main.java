package Parte_2.Ejercicios_pooAvanzado.Ejercicio1_Composicion;

public class Main {
    public static void main(String[] args) {

        Empresa Cepsa = new Empresa("Cepsa","1234d");
        Departamento Ventas = new Departamento(1,"Venta","Madrid",Cepsa);
        Empleado pedro = new Empleado("87458723d","Pedro",19,3000,"Practicas",Ventas);

        System.out.println(Cepsa.toString() + "\n" + Ventas.toString() + "\n" + pedro.toString());

        System.out.println("El sueldo de Pedro es de "+pedro.sueldoNeto(50));


    }
}
b