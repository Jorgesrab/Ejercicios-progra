package bucles.ejemplosTeoriaBucles;

public class Ejemplo10Bucles {
    public static void main(String[] args) {
        //AMBITO 1
        for (int j = 1; j < 5; j++) {
            System.out.println(j);
            for (int i = 1; i < 5; i++) { //ÁMBITO 2
                System.out.println(j);
                System.out.println(j); //OK porque este bloque está en el ámbito 1
            }
           // System.out.println(i); //ERROR, i no está declarada en el ámbito1
           // int j = 9; //ERROR j ya existe en ese ámbito
        }
        // ÁMBITO 3
        int j = 3; // OK,en ese ámbito no hay ninguna variable j
    }
}
