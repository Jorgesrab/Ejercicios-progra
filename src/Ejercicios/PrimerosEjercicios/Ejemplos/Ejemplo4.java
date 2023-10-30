package Ejercicios.PrimerosEjercicios.Ejemplos;

public class Ejemplo4 {
    public static void main(String[] args) {

        //UNIÓN DE STRING
        String nada = ""; //cadena vacía
        String nombre = "Pepe";
        String apellido = "Martínez";
        String nombreCompleto1 = nombre + apellido; //PepeMartínez
        String nombreCompleto2 = nombre + " " + apellido; //Pepe Martínez

        //STRING CON NÚMEROS
        nombre = "Pepe";
        String frase;
        int cantidad = 20;
        frase = nombre + " tiene " + cantidad +" años"; //Pepe tiene 20 años
        frase = nombre + " tiene " + cantidad + 5 +" años"; //Pepe tiene 205 años
        frase = nombre + " tiene " + (cantidad + 5) +" años"; //Pepe tiene 25 años
        frase = nombre + " tiene " + 15 + 5 +" años"; //Pepe tiene 155 años
        frase = nombre + " tiene " + (15 + 5) +" años"; //Pepe tiene 20 años
        frase = nombre + " tiene " + (15 - 5) +" años"; //Pepe tiene 10 años
       // frase = nombre + " tiene " + 15 - 5 +" años"; //ERROR porque el operador - no se aplica a String
        frase = 15 + 5 + nombre; //20Pepe
        frase = 5 - 15 + nombre; //-10Pepe
        frase = 5 - 10 + nombre + 5 + 10 + (5 + 5); //-5Pepe51010


        //MAS CON NÚMEROS
        cantidad = 10;
        int precio = 50;
        float num = 2.5f;
        float num2 = 10f;
        String s1 = "El total es "+(cantidad+precio); //El total es 60
        String s2 = "El total es "+cantidad*precio; //El total es 500
        String s3 = "El total es "+cantidad+precio; //El total es 1050
       // String s4 = cantidad+precio; //ERROR porque eso da un número
     //   String s5 = cantidad*precio; //ERROR porque eso da un número y lo intentas almacenar en un String
      //  String s6 = (cantidad+precio); //ERROR
        String s7 = ""+cantidad+precio; //1050
        String s8 = ""+(cantidad+precio); //60
        String s9 = "El total es "+(cantidad+num); //El total es 12.5
        String s10 = "El total es "+(cantidad/3); //El total es 3
        String s11 = "El total es "+(num2/3); //El total es 3.3333333
        String s12 = "El total es "+(cantidad/3f); //El total es 3.3333333
        String s13 = "El total es "+(cantidad/3d); //El total es 3.3333333333333335

        //EJEMPLOS DE SECUENCIA DE ESCAPES
         nombre = "Pepe";
        String apellidos = "Martínez García";
        nombreCompleto1 = nombre+" "+apellidos; // Pepe Martínez García
        nombreCompleto2 = "\"+nombre+apellidos+\""; // "+nombre+apellidos+"
        String nombreCompleto3 = "\""+nombre+apellidos+"\""; // "PepeMartínez García"
        String nombre2 = nombre+"\b"+nombre; // PepPepe
        String apellidos2 = apellidos+"\r,"+nombre; // ,Pepenez García
        String apellidos3 = apellidos+"\b,"+nombre; // Martínez Garcí,Pepe
        String apellidos4 = apellidos+"\\,"+nombre; // Martínez García\,Pepe
        String apellidos5 = "\u00A9 "+nombre; // © Pepe
        String apellidos6 = "\u00AE "+nombre; // ® Pepe
        String apellidos7 = "\u2605 "+nombre; // ★ Pepe
        String apellidos8 = "\u2661 "+nombre; // ♡ Pepe

        System.out.println(nombreCompleto1);
        System.out.println(nombreCompleto2);
        System.out.println(nombreCompleto3);

        System.out.println(nombre2);
        System.out.println(apellidos2);
        System.out.println(apellidos3);
        System.out.println(apellidos4);
        System.out.println(apellidos5);
        System.out.println(apellidos6);
        System.out.println(apellidos7);
        System.out.println(apellidos8);
    }
}
