package Parte_1.Ejercicios.String;

public class Ejercicio_1 {
    public static void main(String[] args) {


        //a
        String texto1 = "¡Hola desde JAVA!";
        System.out.println(texto1);

        //b
        String texto2;
        texto2 = "Hola desde java ";
        System.out.println(texto2);

        //c
        String texto3 = new String();

        //d
        texto3 = "Hola desde el constructor";
        System.out.println(texto3);

        //e
        String texto4 = new String("Hola desde el constructor en una linea");

        //f
        double numero = 1.98765432;
        String texto5= String.valueOf(numero);
        System.out.println(texto5);

        //g
        System.out.println(texto1+"\n"+texto2+"\n"+texto3+"\n"+texto4+"\n"+texto5);

        //h
        System.out.println(texto1.length());

        //i
        System.out.println("hola".length());

        //j

        //k
        texto4=texto4.concat("hola");

        System.out.println(texto4);

        System.out.println(texto1.charAt(0));


        String texto10 = texto1.substring(0,5);
        System.out.println(texto10);

        String texto11= "He dibujado un bonito dibujo";
        System.out.println(texto11.indexOf("dibu"));
        System.out.println(texto11.lastIndexOf("dibu"));



    }
}
