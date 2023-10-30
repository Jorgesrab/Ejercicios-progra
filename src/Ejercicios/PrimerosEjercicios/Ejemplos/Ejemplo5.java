package Ejercicios.PrimerosEjercicios.Ejemplos;

public class Ejemplo5 {
    public static void main(String[] args) {
        //CONVERSIONES DE TIPO IMPLÍCITA
        double x = 2.5;
        double y = 30 - x;  // te convierte 30 en 30.0
        System.out.println("Y double vale: "+y);
        //CONVERSIONES DE TIPO EXPLÍCITO
        //¿Qué pasa si es de tipo int? Hay que forzar la conversión
        int xx = 30;
        int yy = (int) (xx - 2.5);  // se pierde información
        System.out.println("Y int vale: "+yy);

        System.out.println(5/9);   //0
        System.out.println((double)5/9); // 0.5555555555555556
    }
}
