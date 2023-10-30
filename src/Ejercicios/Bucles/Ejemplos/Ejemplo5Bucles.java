package bucles.ejemplosTeoriaBucles;

/*
Equivalencia entre bucle FOR y WHILE
 */
public class Ejemplo5Bucles {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        int i=1; //la variable i empieza en 1
        while (i < 6) {
            System.out.println(i);
            i++; //incremento al final
        }
    }
}
