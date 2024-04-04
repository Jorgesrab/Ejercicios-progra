package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

public class RestauranteAlmacen {
    private int papas;
    private int chocos;
    public void anyadirPapas(int papas) {this.papas += papas; }

    public void mostrarPapas() { System.out.println("Hay " + papas + " kilos de papas"); }
    public void anyadirChocos(int chocos) { this.chocos += chocos; }
    public void mostrarChocos() { System.out.println("Hay " + chocos + " kilos de chocos"); }

    public void mermaChocos(int chocos) { this.chocos -= chocos; }
    public void mermaPapas(int papas) { this.papas -= papas; }

    public int clientesAtencion() {
        int numClientes, menorCantidad;
        menorCantidad = papas<chocos?papas:chocos;
        numClientes = menorCantidad*4;
        return numClientes;
    }
}
