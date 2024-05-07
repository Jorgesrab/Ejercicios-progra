package Parte_2.Ejercicios_pooAvanzado.Ejercicio9_SeleccionDeFutbol;

public class Jugador extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    @Override
    public void entrar() {
        System.out.println("Realiza un entreno la clase jugador");

    }

    @Override
    public void partidoFutbol() {
        System.out.println("Juega el partido la clase jugador");
    }
    public void entrevista(){
        System.out.println("El jugador tiene una entrevista");
    }
}
