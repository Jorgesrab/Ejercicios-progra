package Ejercicios.Bucles.ejercicios;

public class Ejercicio_25 {
    public static void main(String[] args) {

        double pago=10;
        double auxPago = pago;
        double pagoTotal=0;
        String mes = "";

        for (int mesNumero =1 ; mesNumero <= 12; mesNumero++) {

            switch (mesNumero){
                case 1 -> mes = "enero";
                case 2 -> mes = "febrero";
                case 3 -> mes = "marzo";
                case 4 -> mes = "abril";
                case 5 -> mes = "mayo";
                case 6 -> mes = "junio";
                case 7 -> mes = "julio";
                case 8 -> mes = "agosto";
                case 9 -> mes = "septiembre";
                case 10 -> mes = "octubre";
                case 11 -> mes = "noviembre";
                case 12 -> mes = "diciembre";

            }
            pago = auxPago *Math.pow(2,mesNumero);
            pagoTotal = pagoTotal + pago;

            System.out.println("|en "+mes+ " habras ahorrado "+pago+ " euros|" );
            System.out.println("-------------------------------------------");


        }
        System.out.println("Durante todo el año has ahorrado "+pagoTotal+ " euros");
    }
}
