package Parte_1.Ejercicios.String;

import java.util.Scanner;
import java.util.Arrays;
// Reverse.java

public class StringsEjercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de los ejercicios");
            System.out.println("1. Abrir el ejercicio 2.");
            System.out.println("2. Abrir el ejercicio 3.");
            System.out.println("3. Abrir el ejercicio 4.");
            System.out.println("4. Abrir el ejercicio 5.");
            System.out.println("5. Abrir el ejercicio 6.");
            System.out.println("6. Abrir el ejercicio 7.");
            System.out.println("7. Abrir el ejercicio 8.");
            System.out.println("8. Abrir el ejercicio 9.");
            System.out.println("9. Abrir el ejercicio 10.");
            System.out.println("10. Abrir el ejercicio 11.");
            System.out.println("11. Abrir el ejercicio 12.");

            System.out.println("0. Salir del menú");

            System.out.println("Introduce el número según la opción deseada");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado 'Abrir el ejercicio 2', espere un segundo...");
                    ejercicio2(sc);
                    break;
                case 2:
                    System.out.println("Has seleccionado 'Abrir el ejercicio 3', espere un segundo...");
                    ejercicio3(sc);
                    break;
                case 3:
                    System.out.println("Has seleccionado 'Abrir el ejercicio 4', espere un segundo...");
                    ejercicio4(sc);
                    break;
                case 4:
                    System.out.println("Has seleccionado 'Abrir el ejercicio 5', espere un segundo...");
                    ejercicio5(sc);
                    break;
                case 5:
                    System.out.println("Has seleccionado 'Abrir el ejercicio 6', espere un segundo...");
                    ejercicio6(sc);
                    break;
                case 6:
                    System.out.println("Has seleccionado 'Abrir el ejercicio 7', espere un segundo...");
                    ejercicio7(sc);
                    break;
                case 7:
                    System.out.println("Has seleccionado 'Abrir el ejercicio 8', espere un segundo...");
                    ejercicio8(sc);
                    break;
                case 8:
                    System.out.println("Has seleccionado 'Abrir el ejercicio 9', espere un segundo...");
                    ejercicio9(sc);
                    break;
                case 9:
                    System.out.println("Has seleccionado 'Abrir el ejercicio 9', espere un segundo...");
                    ejercicio10(sc);
                    break;
                case 10:
                    System.out.println("Has seleccionado 'Abrir el ejercicio 9', espere un segundo...");
                    ejercicio11(sc);
                    break;
                case 11:
                    System.out.println("Has seleccionado 'Abrir el ejercicio 9', espere un segundo...");
                    ejercicio12(sc);
                    break;
                case 0:
                    System.out.println("Has seleccionado 'Salir del menú', espere un segundo...");
                    break;
                default:
                    System.out.println("La opción que has introducido no es válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
        sc.close();
    }

    private static void ejercicio2(Scanner sc) {
        String caracter;
        do {
            System.out.println("Introduce caracteres (números, letras, etc.): ");
            caracter = sc.nextLine();
            char caracterOrigen = caracter.charAt(0);

            if (Character.isDigit(caracterOrigen)) {
                System.out.println("El parámetro introducido es un número.");
            } else if (Character.isLowerCase(caracterOrigen)) {
                System.out.println("El parámetro introducido es una letra minúscula.");
            } else if (Character.isUpperCase(caracterOrigen)) {
                System.out.println("El parámetro introducido es una letra mayúscula.");
            } else if (!Character.isWhitespace(caracterOrigen)) {
                System.out.println("El parámetro introducido es un caracter especial.");
            }
        } while (!caracter.contains(" "));
        System.exit(0);
    }

    private static void ejercicio3(Scanner sc) {
        System.out.println("Introduce el DNI (Solo el número)");
        int dni = sc.nextInt();

        String nif = obtenerDni(dni);
        System.out.println("El NIF es: " + nif);

        char letra = obtenerLetraDni(dni);
        System.out.println("La letra correspondiente al NIF es: " + letra);
    }

    private static void ejercicio4(Scanner sc) {
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        int i = 1;
        String[] palabras = frase.split(" ");
        for (String elemento : palabras) {
            System.out.println("Palabra " + i + ": " + elemento);
            i++;
        }
    }

    private static void ejercicio5(Scanner sc) {
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() <= 4) {
                System.out.println("Palabra " + i + ": " + palabras[i].toUpperCase());
            } else if (palabras[i].length() > 4) {
                System.out.println("Palabra " + i + ": " + palabras[i].toLowerCase());
            }
        }
    }

    private static void ejercicio6(Scanner sc) {
        String contrasenia;
        do {
            System.out.println("Introduce una contraseña: ");
            contrasenia = sc.nextLine();

            if (!tieneMayuscula(contrasenia)) {
                System.out.println("La contraseña no contiene una letra mayúscula. Inténtelo de nuevo.");
            }
            if (!tieneMinuscula(contrasenia)) {
                System.out.println("La contraseña no contiene una letra minúscula. Inténtelo de nuevo.");
            }
            if (!tieneNumero(contrasenia)) {
                System.out.println("La contraseña no contiene un número. Inténtelo de nuevo.");
            }
            if (tieneEspacioBlanco(contrasenia)) {
                System.out.println("La contraseña contiene espacios en blanco. inténtelo de nuevo.");
            }
            if (!tieneCaracterAlfanumeico(contrasenia)) {
                System.out.println("La contraseña no contiene un caracter alfanumérico. Inténtelo de nuevo.");
            }
            if (!tieneLongitudValida(contrasenia)) {
                System.out.println("Tu contraseña no cumple con la longitud requerida. Inténtelo de nuevo.");
            }


        } while (!cumpleRequisitos(contrasenia));

        System.out.println("La contraseña cumple todos los requisitos. ¡Enhorabuena!");
        sc.close();
    }

    private static void ejercicio7(Scanner sc) {
        System.out.println("Escriba la palabra que desees: ");
        String palabra = sc.nextLine();

        int letras = 0;
        int mayusculas = 0;
        int minusculas = 0;
        int digitos = 0;
        int alfanumericos = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);

            if (Character.isLetter(caracter)) {
                letras++;

                if (Character.isUpperCase(caracter)) {
                    mayusculas++;
                } else {
                    minusculas++;
                }
            } else if (Character.isDigit(caracter)) {
                digitos++;
            } else if (!Character.isLetterOrDigit(caracter)) {
                alfanumericos++;
            }
        }

        System.out.println("Total de letras: " + letras);
        System.out.println("Total de mayúsculas: " + mayusculas);
        System.out.println("Total de minúsculas: " + minusculas);
        System.out.println("Total de dígitos: " + digitos);
        System.out.println("Tottal de alfanuméricos: " + alfanumericos);
    }

    private static void ejercicio8(Scanner sc) {
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("Palabra original: " + frase);
        System.out.println("Palabra modificada: " + corregirEspaciosBlancos(frase));
    }

    private static void ejercicio9(Scanner sc) {
        System.out.println("Introduce una frase que contenga la palabra 'tardes': ");
        String frase = sc.nextLine();
        System.out.println("Introduzca la palabra que desees reemplazar: ");
        String palabra = "tardes";

        System.out.println(reemplazarPalabra(frase, palabra, sc));
    }

    private static void ejercicio10(Scanner sc) {
        int contador = 0;

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.println("¿Qué letra deseas buscar en esta frase?: ");
        char letra = sc.nextLine().charAt(0);

        System.out.println(contarCaracteres(frase, letra, contador));
    }

    private static void ejercicio11(Scanner sc) {
        System.out.println("Introduzca una frase (sin tildes): ");
        String frase = sc.nextLine();
        System.out.println("Se procederá a verificar si es palíndromo o no.");

        if (verificarPalindromo(frase)) {
            System.out.println("'" + frase + "' es un palíndromo");
        } else {
            System.out.println("'" + frase + "' no es un palíndromo");
        }
    }

    private static void ejercicio12(Scanner sc) {
        System.out.println("** RECOLECCIÓN DE DATOS **");
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine().toLowerCase();
        System.out.println("Introduzca su primer apellido: ");
        String apellido = sc.nextLine().toLowerCase();
        System.out.println("Introduzca su segundo apellido: ");
        String apellido2 = sc.nextLine().toLowerCase();

        char inicialNombre = Character.toUpperCase(nombre.charAt(0));
        char inicialApellido = Character.toUpperCase(apellido.charAt(0));
        char inicialApellido2 = Character.toUpperCase(apellido2.charAt(0));

        System.out.println("Inicial del nombre en mayúsculas: "+inicialNombre);
        System.out.println("Inicial del primer apellido en mayúsculas: "+inicialApellido);
        System.out.println("Inicial del segundo apellido en mayúsculas: "+inicialApellido2);

        System.out.println("Nombre: "+inicialNombre + nombre.substring(1));
        System.out.println("Primer apellido: "+inicialApellido + apellido.substring(1));
        System.out.println("Segundo apellido: "+inicialApellido2 + apellido2.substring(1));
    }

    static boolean tieneMayuscula(String contrasenia) {
        return contrasenia.matches(".*[A-Z].*");
    }

    static boolean tieneMinuscula(String contrasenia) {
        return contrasenia.matches(".*[a-z].*");
    }

    static boolean tieneLongitudValida(String contrasenia) {
        return contrasenia.length() >= 8 && contrasenia.length() <= 16;
    }


    static boolean tieneCaracterAlfanumeico(String contrasenia) {

        return contrasenia.matches(".*[@#$%&+=].*");

    }


    static boolean tieneNumero(String contrasenia) {

        return contrasenia.matches(".*\\d.*");
    }

    static boolean tieneEspacioBlanco(String contrasenia) {

        return contrasenia.contains(" ");
    }

    static boolean cumpleRequisitos(String contrasenia) {
        return tieneMayuscula(contrasenia) && tieneMinuscula(contrasenia) && tieneNumero(contrasenia) && tieneEspacioBlanco(contrasenia) && tieneCaracterAlfanumeico(contrasenia) && tieneLongitudValida(contrasenia);
    }


    static char obtenerLetraDni(int dni) {
        int resto = (dni % 23);
        char[] letraDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return (letraDNI[resto]);
    }

    static String obtenerDni(int dni) {
        char letra = obtenerLetraDni(dni);
        return dni + "" + letra;
    }

    public static String corregirEspaciosBlancos(String frase) {
        // Utilizamos una expresión regular para encontrar un espacio en blanco seguido de cualquier cantidad de caracteres
        // y lo reemplazamos con el mismo espacio en blanco seguido de otro espacio en blanco.
        return frase.replaceAll("\\s", "  ");
    }

    static String reemplazarPalabra(String frase, String palabra, Scanner sc) {
        System.out.println("¿Qué palabra deseas añadir?: ");
        String palabraNueva = sc.nextLine();
        String fraseReemplazo = "";
        if (frase.contains(palabra)) {
            fraseReemplazo = frase.replace(palabra, palabraNueva);
        }
        return fraseReemplazo;
    }

    static String contarCaracteres(String frase, char letra, int contador) {

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        return "Se ha encontrado la letra " + letra + " una cantidad de " + contador + " veces";
    }

    static boolean verificarPalindromo(String frase) {
        frase = frase.replaceAll("\\s+", "").toLowerCase();
        StringBuilder reverso = new StringBuilder(frase).reverse();

        return frase.contentEquals(reverso.toString());
    }

}
