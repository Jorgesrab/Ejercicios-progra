package EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        int number;
        String Leter = null;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero del DNI");
        number = entrada.nextInt();
        int rest = number%23;
        switch (rest){
            case 0 -> Leter = "T";
            case 1 -> Leter = "R";
            case 2 -> Leter = "W";
            case 3 -> Leter = "A";
            case 4 -> Leter = "G";
            case 5 -> Leter = "M";
            case 6 -> Leter = "Y";
            case 7 -> Leter = "F";
            case 8 -> Leter = "P";
            case 9 -> Leter = "D";
            case 10 -> Leter = "X";
            case 11 -> Leter = "B";
            case 12 -> Leter = "N";
            case 13 -> Leter = "J";
            case 14-> Leter = "Z";
            case 15-> Leter = "S";
            case 16-> Leter = "Q";
            case 17-> Leter = "V";
            case 18-> Leter = "H";
            case 19-> Leter = "L";
            case 20-> Leter = "C";
            case 21-> Leter = "K";
            case 22-> Leter = "E";
        }

        System.out.println(number+""+Leter);

    }
}
