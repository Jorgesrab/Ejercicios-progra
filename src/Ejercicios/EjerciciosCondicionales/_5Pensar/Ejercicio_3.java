package EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        String name;
        String Password;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el nombre");
        name = entrada.nextLine();
        System.out.println("Introduce la contraseña");
        Password = entrada.nextLine();

        if (name.equals("pepe") && Password.equals("asdasd")) {
            System.out.println("permiso concedido");
        } else if (name.equals("pepe") && !Password.equals("asdasd")) {
            System.out.println("Contraseña incorrecta");
        }else if (!name.equals("pepe") && Password.equals("asdasd"))
        {
            System.out.println("usuario incorrecto");
        } else if (!name.equals("pepe") && !Password.equals("asdasd")) {
            System.out.println("Usuario y contraseña incorrectos");

        }

    }

}

