package Ejercicios.Ejerciciosresueltoss;

import java.util.Scanner;

public class Funciones1_19 {
    public static void main(String[] args) {
        System.out.println("*_*_*_*_*_*_BIENVENIDOS A MI APLICACIÓN_*_*_*_*_*_*");
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        final int NUM_EJERCICIOS = 19;
        final String MENSAJE_DESPEDIDA = "ADIÓS, GRACIAS POR USAR NUESTRA APLICACIÓN";
        final String MENSAJE_OPCION_ERROR = "Esa opción no existe. Por favor, introduzca una correcta.";

        do {
            System.out.println("Elige ejercicio:");
            mostrarMenu(NUM_EJERCICIOS); //mostramos el menú de opciones

            System.out.print("----- Opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio1(sc);
                }
                case 2 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio2(sc);
                }
                case 3 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio3(sc);
                }
                case 4 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio4(sc);
                }
                case 5 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio5(sc);
                }
                case 6 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio6(sc);
                }
                case 7 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio7(sc);
                }
                case 8 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio8(sc);
                }
                case 9 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio9(sc);
                }
                case 10 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio10(sc);
                }
                case 11 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio11(sc);
                }
                case 12 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio12(sc);
                }
                case 13 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio13(sc);
                }
                case 14 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio14();
                }
                case 15 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio15(sc);
                }
                case 16 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio16();
                }
                case 17 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio17(sc);
                }
                case 18 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio18(sc);
                }
                case 19 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio19(sc);
                }
                case 0 -> {
                    System.out.println(MENSAJE_DESPEDIDA);
                }
                default -> {
                    System.out.println(MENSAJE_OPCION_ERROR);
                }
            }
        } while (opcion != 0);

    }

    private static String mostrarTituloEjercicio(int opcion) {
        String mensaje = "****** EJERCICIO " + opcion + " ****** ";
        return mensaje;
        //las dos líneas anteriores también puede ponerse así:
        //  return "****** EJERCICIO "+opcion+" ****** ";
    }

    private static void mostrarMenu(int num_ejercicios) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + ". Ejercicio " + i);
        }
        System.out.println("0. Salir");
    }

    /*
    Ejercicio 1.- Programa que pida dos números dobles por teclado y muestre por
    pantalla el resultado de multiplicarlos. Hazlo implementando y usando la siguiente
    función:
    double multiplica(double a, double b)
// Devuelve la multiplicación de dos números
     */
    private static void ejercicio1(Scanner sc) {
        System.out.print("\nIntroduzca número 1: ");
        double numero1 = sc.nextDouble();
        System.out.print("Introduzca número 2: ");
        double numero2 = sc.nextDouble();
        double resultado = multiplica(numero1, numero2);
        System.out.println("Ejercicio 1: la multiplicación es " + resultado);
        sc.nextLine();
    }

    static double multiplica(double a, double b) {
        return a * b;
    }

    /*
    Ejercicio 2.- Programa que pida la edad por teclado y muestre por pantalla si eres
mayor de edad o no. Hazlo implementando y usando la siguiente función:
boolean esMayorEdad(int a)
// Devuelve verdadero si a>=18, falso en caso contrario
     */
    private static void ejercicio2(Scanner sc) {
        System.out.print("\nIntroduzca tu edad: ");
        int edad = sc.nextInt();
        boolean resultado = esMayorEdad(edad);
        System.out.println("Ejercicio 2: ¿eres mayor de edad? " + resultado);
        sc.nextLine();
    }

    private static boolean esMayorEdad(int a) {
        if (a >= 18) {
            return true;
        } else {
            return false;
        }
       /* Otra forma de poner lo anterior:
        return (a >= 18);
        si se cumple da true y sino pues da false
        */
    }

    /*
    Ejercicio 3.- Programa que pida dos números enteros por teclado y muestre por
pantalla cual es el mínimo. Hazlo implementando y usando la siguiente función:
int minimo(int a, int b) // Devuelve el menor entre a y b
     */
    private static void ejercicio3(Scanner sc) {
        System.out.print("\nIntroduzca número 1: ");
        int numero1 = sc.nextInt();
        System.out.print("Introduzca número 2: ");
        int numero2 = sc.nextInt();
        int resultado = minimo(numero1, numero2);
        System.out.println("Ejercicio 3: el mínimo es" + resultado);
        sc.nextLine();
    }

    private static int minimo(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }

    /*
    Ejercicio 4.- Programa que pida un número entero por teclado y muestre por pantalla
si es positivo, negativo o cero. Hazlo implementando y usando la siguiente función:
int dimeSigno(int a)
// Esta función devuelve -1 si es negativo, 0 si es igual a 0, 1
si es positivo
     */
    private static void ejercicio4(Scanner sc) {
        System.out.print("\nIntroduzca un número:  ");
        int numero1 = sc.nextInt();
        sc.nextLine();
        int resultado = dimeSigno(numero1);
        if (resultado == -1) {
            System.out.println("Ejercicio 4: El número es negativo");
        } else if (resultado == 1) {
            System.out.println("Ejercicio 4: El número es positivo");
        } else {
            System.out.println("Ejercicio 4: El número es cero");
        }
    }

    private static int dimeSigno(int a) {
        if (a < 0) {
            return -1;
        } else if (a > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /*
    Ejercicio 5.- Programa que pida un valor entero en millas y muestre su equivalente
en kilómetros. Recuerda que una milla son 1,60934 kilómetros. Hazlo implementando
y usando la siguiente función:
double millasAkilometros(int millas)
// Devuelve la conversión de millas a kilómetros
     */
    private static void ejercicio5(Scanner sc) {
        System.out.print("\nIntroduzca un número:  ");
        int numero1 = sc.nextInt();
        sc.nextLine();
        double resultado = millasAKilometros(numero1);
        System.out.println("Ejercicio 5: conversión millas a kilómetros:\n\t\t" +
                +numero1 + " millas son " + resultado + " kilómetros.");
    }

    private static double millasAKilometros(int millas) {
        return millas * 1.60934;
    }

    /*
    Ejercicio 6.- Programa que pide al usuario cinco precios y muestre por pantalla el
precio de venta de cada uno tras aplicarle un 21% de IVA. Hazlo implementando y
usando la siguiente función:
double precioConIVA(double precio)
// Devuelve el precio tras sumarle un 21% de IVA
     */
    private static void ejercicio6(Scanner sc) {
        double precio = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("\nIntroduzca precio del producto " + i + " : ");
            precio = sc.nextInt();
            sc.nextLine();
            double precioMasIva = precioConIVA(precio);
            System.out.println("Ejercicio 6: precio con iva del producto " + i + "es " + precioMasIva);
        }
    }

    private static double precioConIVA(double precio) {
        return precio * 1.21;
    }


    /*
    Ejercicio 7.- Programa que pida el ancho y alto de un rectángulo y muestre por
pantalla su área y su perímetro. Hazlo implementando y usando las siguientes
funciones:
// Devuelve el perímetro
double perimetroRectangulo(double ancho, double alto)
// Devuelve el área
double areaRectangulo(double ancho, double alto)
     */
    private static void ejercicio7(Scanner sc) {
        System.out.print("\nDame el ancho del rectángulo: ");
        double ancho = sc.nextDouble();
        System.out.print("\nDame el largo del rectángulo: ");
        double largo = sc.nextDouble();
        System.out.println("Ejercicio 7: el perímetro del rectángulo es " + perimetroRectangulo(ancho, largo));
        System.out.println("Ejercicio 7: el área del rectángulo es " + areaRectangulo(ancho, largo));
        sc.nextLine();
    }

    private static double areaRectangulo(double ancho, double largo) {
        return ancho * largo;
    }

    private static double perimetroRectangulo(double ancho, double largo) {
        return (ancho * 2) + (largo + 2);
    }

    /*
    Ejercicio 8.- Programa que pida un valor N entero y luego muestre: el sumatorio
desde 1 a N, el producto de 1 a N y el valor intermedio entre 1 y N. Hazlo
implementando y utiliza las funciones:
int suma1aN(int n) //Devuelve la suma de enteros de 1 a n
int producto1aN(int n) //Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) //Devuelve el valor intermedio entre
1y n
     */
    private static void ejercicio8(Scanner sc) {
        System.out.print("\nDame un valor entero: ");
        int valor = sc.nextInt();
        int sumaTodos = suma1aN(valor);
        int productoTodos = producto1aN(valor);
        //double intermedio = intermedio1aN(valor);
        System.out.println("Suma de 1 a " + valor + " es " + sumaTodos);
        System.out.println("Multiplicación de 1 a " + valor + " es " + productoTodos);
        System.out.println("El número intermedio entre 1 y " + valor + " es " + intermedio1aN(valor));
        //  System.out.println("El número intermedio entre 1 y "+valor+" es "+intermedio);
        sc.nextLine();

    }

    private static int suma1aN(int valor) {
        int resultado = 0;
        for (int i = 1; i <= valor; i++) {
            resultado += i;
        }
        return resultado;
    }

    private static int producto1aN(int valor) {
        int resultado = 1;
        for (int i = 1; i <= valor; i++) {
            resultado *= i;
        }
        return resultado;
    }

    private static double intermedio1aN(int valor) {
        return valor / 2.0;
    }

    /*
Ejercicio 9.- Programa que pida introducir tres valores enteros y nos diga cuál
de ellos es el mayor. Impleméntalo creando únicamente una función a
la que le pasemos dos valores (no tres) y nos devuelva el máximo de los dos
valores.
     */
    private static void ejercicio9(Scanner sc) {
        System.out.print("\nDime el número 1: ");
        int valor1 = sc.nextInt();
        System.out.print("\nDime el número 2: ");
        int valor2 = sc.nextInt();
        System.out.print("\nDime el número 3: ");
        int valor3 = sc.nextInt();
        int max;
        max = maximo(valor1, valor2); //comparo dos valores
        max = maximo(max, valor3);
        //de los dos anteriores, comparo el que era mayor con el valor3 que queda
        System.out.println("Máximo: " + max);
        sc.nextLine();
    }

    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        // También se puede hacer con el operador ternario '?' así:
        // return (a > b) ? a : b;
    }

    /*
Ejercicio 10.- Programa que lea una fecha introduciendo el día, mes y año por
separado y nos diga si la fecha es correcta o no. Supondremos que todos los
meses tienen 30 días. Se debe crear una función donde le pasemos los datos
(día, mes y año) y devuelva si es correcta o no.*/
    private static void ejercicio10(Scanner entrada) {
        int dia, mes, anio;
        boolean escorrecta;
        System.out.print("Valor del dia: ");
        dia = entrada.nextInt();
        System.out.print("Valor del mes: ");
        mes = entrada.nextInt();
        System.out.print("Valor del año: ");
        anio = entrada.nextInt();
        escorrecta = fechacorrecta(dia, mes, anio);
        if (escorrecta) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha no es correcta");
        }
        entrada.nextLine();
    }

    public static boolean fechacorrecta(int dia, int mes, int anyo) {
        if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12)) {
            return true;
        } else {
            return false;
        }
        // También se puede hacer directamente así
        // return (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12);
    }


    /*
Ejercicio 11.- Pedir al usuario un número y mostrar por pantalla la tabla de multiplicar
de ese número. Para ello implementa una función que reciba como parámetro un
número entero y muestre por pantalla la tabla de multiplicar de dicho número.
*/
    private static void ejercicio11(Scanner entrada) {
        int n;
        System.out.print("Introduce un número N: ");
        n = entrada.nextInt();
        entrada.nextLine();
        tablaMultiplicar(n);
    }

    public static void tablaMultiplicar(int n) {
        System.out.println("Tabla de multiplicar del " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }


    /*
Ejercicio 12.- Programa que dado un valor en kilómetros nos lo traduce a
millas. El programa debe tener una función que reciba como parámetro una
cantidad en kilómetros y nos la devuelva en millas.
*/
    private static void ejercicio12(Scanner sc) {
        double millas, km;
        System.out.print("Introduce los kms: ");
        km = sc.nextDouble();
        sc.nextLine();
        millas = kilometrosAmillas(km);

        System.out.println("Millas: " + millas);
    }

    public static double kilometrosAmillas(double km) {
        return (km / 1.60934);
    }
    /*
Ejercicio 13.- Programa que calcule el porcentaje de descuento que nos han hecho
al comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el
descuento aplicado. Se debe crear una función a la que le pasemos ambos valores y
nos devuelva el descuento.
     */

    private static void ejercicio13(Scanner sc) {
        double precio, pvp, porcDto;
        System.out.print("Precio original: ");
        precio = sc.nextDouble();
        System.out.print("Precio tras descuento: ");
        pvp = sc.nextDouble();
        sc.nextLine();
        porcDto = calculaPorcDto(precio, pvp);
        System.out.printf("Descuento : " + porcDto);
    }

    public static double calculaPorcDto(double precio, double pvp) {
        return 100 - ((100 * pvp) / precio);
    }


    private static void ejercicio14() {
        System.out.println("NO EXISTE ESTE EJERCICIO");
    }


    /*
    Ejercicio 15.- Programa que nos pida número enteros hasta que se introduzca
el 0, diciéndonos, para cada número introducido si es primo o no. Hay que
recordar que un número es primo si es divisible por si mismo y por 1. El 1 no
es primo por convenio. Se debe crear una función que pasándole un número
entero devuelva si es primo o no.
*/

    private static void ejercicio15(Scanner in) {
        int numero;
        boolean primo;

        do {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = in.nextInt();
            if (numero != 0) {
                primo = esPrimo(numero);
                // Mostramos mensaje
                if (primo) {
                    System.out.println("Es primo.");
                } else {
                    System.out.println("No es primo.");
                }
            }
        } while (numero != 0);
       in.nextLine();
    }

    public static boolean esPrimo(int n) {
        boolean primazo = true;
        // Si es 2, 1, 0 o negativo => NO ES PRIMO
        if (n <= 2) {
            primazo = false;
        } else {
            for (int i = 3; i < n; i++) {
                // Si n es divisible por i => NO ES PRIMO
                if (n % i == 0) {
                    primazo = false;
                }
            }
        }
        return primazo;
    }


    /*Ejercicio 16.- Programa que imprima las tablas de multiplicar del 1 al 10.
Implementa una función que reciba un número entero como parámetro e
imprima su tabla de multiplicar.
     */
    private static void ejercicio16() {
        for (int i = 1; i <= 10; i++) {
            tabla_multiplicar16(i);
        }
    }

    public static void tabla_multiplicar16(int n) {
        System.out.println("Tabla de multiplicar del " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }


    /*
    Ejercicio 17.- Diseñar una calculadora de modo que se le pide al usuario qué
    operación quiere realizar (suma, resta, división o multiplicación) y se le devuelve el
    resultado. Haz una función para cada operación.
     */
    private static void ejercicio17(Scanner sc) {
        //confiemos en que elige una de esas 4 opciones
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. División");
        System.out.println("4. Multiplicación");
        int opcion = sc.nextInt();
        System.out.println("Dime el número 1");
        double numero1 = sc.nextDouble();
        System.out.println("Dime el número 2");
        double numero2 = sc.nextDouble();
        sc.nextLine();
        switch (opcion) {
            case 1 -> {
                System.out.println(suma(numero1, numero2));
            }
            case 2 -> {
                System.out.println(resta(numero1, numero2));
            }
            case 3 -> {
                System.out.println(division(numero1, numero2));
            }
            case 4 -> {
                System.out.println(multiplicacion(numero1, numero2));
            }
            default -> {
                System.out.println("Opcíon incorrecta");
            }
        }
    }

    private static String suma(double n1, double n2) {
        return n1+" + " + n2 + " = "+ (n1+n2);
    }
    private static String resta(double n1, double n2) {
        return n1+" - " + n2 + " = "+ (n1 - n2);
    }
    private static String division(double n1, double n2) {
        if (n2 == 0){
            return "Error: división por cero";
        } else {
            return n1+" / " + n2 + " = "+ (n1/n2);
        }
    }
    private static String multiplicacion(double n1, double n2) {
        return n1+" * " + n2 + " = "+ (n1*n2);
    }


    /*
    Ejercicio 18.- Diseñar una calculadora de modo que se le pide al usuario qué
    operación quiere realizar (suma, resta, división o multiplicación) y se le devuelve el
    resultado. Haz una función para todas las operaciones, por lo que la función, además
    de recibir como parámetro dos números, deberá recibir qué operación realizar
    (“suma” o “+”,… impleméntalo como quieras).
     */
    private static void ejercicio18(Scanner sc) {
        //confiemos en que elige una de esas 4 opciones
        sc.nextLine();
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. División");
        System.out.println("4. Multiplicación");
        String opcion = sc.nextLine();
        System.out.println("Dime el número 1");
        double numero1 = sc.nextDouble();
        System.out.println("Dime el número 2");
        double numero2 = sc.nextDouble();
        sc.nextLine();
        System.out.println(calculadora(numero1, numero2, opcion.toLowerCase()));
    }

    private static String calculadora (double n1, double n2, String operacion) {
        switch (operacion) {
            case "suma" -> {
                return n1+" + " + n2 + " = "+ (n1 + n2);
            }
            case "resta" -> {
                return n1+" - " + n2 + " = "+ (n1 - n2);
            }
            case "division" -> {
                if (n2 == 0){
                    return "Error: división por cero";
                } else {
                    return n1+" / " + n2 + " = "+ (n1/n2);
                }
            }
            case "multiplicacion" -> {
                return n1+" * " + n2 + " = "+ (n1 * n2);            }
            default -> {
                System.out.println("Opcíon incorrecta");
            }
        }
        return n1+" + " + n2 + " = "+ (n1+n2);
    }


    /*
    Ejercicio 19.- Escribe una función que decida si dos números enteros positivos son
    amigos. Dos números n1 y n2 son amigos si la suma de sus divisores propios (sin
    contarse a él mismo) de n1 es igual a n2. Y viceversa.
    Para probar puedes usar los números 220 y 284, que zona amigos.
     */
    private static void ejercicio19(Scanner sc) {
        System.out.println("Escriba un número: ");
        int n1 =  sc.nextInt();
        System.out.println("Escriba otro número: ");
        int n2 =  sc.nextInt();
        sc.nextLine();
        int suma1 = sumaDivisoresPropios(n1);
        int suma2 = sumaDivisoresPropios(n2);

        if (suma1==n2 && suma2==n1) {
            System.out.println("Los números son amigos.");
        } else {
            System.out.println("Los números no son amigos.");
        }
    }
    private static int sumaDivisoresPropios(int n) {
        int suma = 0;
        for(int i=1; i<n; i++) {
            if (n%i==0) {
                suma += i;
            }
        }
        return suma;
    }



}