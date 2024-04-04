package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

public class CuentaMain {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(15800);
        cuenta1.ingresar(1500);
        cuenta1.mostrar();
        cuenta1.retirar(7500);
        cuenta1.mostrar();
        Cuenta cuenta2 = new Cuenta(0);
        cuenta2.mostrar();
        cuenta1.transferencia(cuenta2,100);
        cuenta1.mostrar();
        cuenta2.mostrar();
    }
}
