package PrimerosEjercicios.Ejemplos;

public class Ejemplo3 {
    public static void main(String[] args) {
        int numero; //identificador numero para variable tipo int
        char letraA = 'A'; //identificador para variable tipo char
        char letraB = 'b';
        //int 2numero; //identificador inválido por empezar por numero
        int numero2;

        double resultado = 3.8;
        String mensaje = "Hola, buenos días";
        System.out.println(mensaje);

        //STRING
        String adios = "Adiós";
        String mensajeNoche = "Buenas noches";
        String despedida = adios + mensajeNoche; // el operador + en texto, une
        System.out.println(adios);
        System.out.println(despedida);
        System.out.println(adios + mensajeNoche);


        //LITERALES: son un valor que se le puede dar a una variable
        //se escriben directamente en el código
        //Tipo entero
        int num = 2323;
        int numNegativo = -2323;

        //int es el que normalmente utilicemos cuando tratemos números enteros
        //tipo long si hay que indicarlo con una L
        long numeroLong = 1234567890123456L;
        // Desde Java SE 7, se puede usar el guion bajo (_)
        // para delimitar parte de un literal entero.
        // Java no lo procesará como parte de ese literal.
        long numeroTarjetaCredito = 1234_5678_9012_3456L;
        //No puede aparecer el guion ni al principio ni al final del número, ni entre letras, solo entre los números

        //Tipo real
        double numDoble = 9.5;
        double numDobleNegativo = -4561564.67342;
        float numRealFloat = -453.333F;

        //tipo boolean
        boolean verdad = true;
        boolean mentira = false;
        boolean parar = 7!=8;  //se almacenará true en la variable parar

        //Tipo carácter
        char letra = 'A'; // "letra" es un carácter y tiene guardada la letra A
        char simbolo = '*'; // "simbolo" es un carácter y tiene guardado el carácter asterisco *
        char letraASCII = 65;
        System.out.println("letra en código ASCII:  " + letraASCII);
        char letraUnicode = '\u0041';
        System.out.println("letra en código UNICODE: " + letraUnicode);


        /*En JAVA las variables de tipo char internamente funcionan como enteros, de hecho
        podemos cambiar su valor a través de operaciones aritméticas. Los valores más
        frecuentes están definidos en la tabla ASCII.
         */
        char letr = 'A' + 1; // "letra" y tiene guardada la letra A+1, en ascii A es 65, por lo que se almacena el 69 que es la letra B
        System.out.println(letr);        //Tipo String
        String dia1Semana = "lunes";
        //Secuencias de escape
        System.out.println("Lunes\rMartes, Miércoles");
        System.out.println("Primera línea\nSegunda línea del string\n");
        System.out.println("Lunes\bMartes");
        System.out.println("Lunes\tMartes\tMiércoles");
        System.out.println("\"Lunes\",\"Martes\",\'Miércoles\'");



    }
}
