package Parte_1.Ejercicios.POO.ejemplos;
/*
Un restaurante mejicano cuya especialidad son las papas con choclos, nos pide diseñar
un programa que gestione su almacén, y que para ello haga todo ésto:
• Añadir papas: Guardar kg de papas en almacén (añadiéndolos a los que ya tengamos en el almacén)
• Mostrar almacén papas: Muestra por pantalla los kilos de papas que hay en el almacén.
• Añadir choclos: Guardar kg de choclos en almacén (añadiéndolos a los que ya tengamos en el almacén)
• Mostrar almacén choclos: Muestra por pantalla los kilos de choclos que hay en el almacén.
• Merma de choclos: Restamos los kg de choclos que se han estropeado y se han tirado a la basura, del total que tenemos en el almacén.
• Merma de papas: Restamos los kg de papas que se han estropeado y se han tirado a la basura, del total que tenemos en el almacén.
• Devuelve el número de clientes que puede atender el restaurante: Para calcularlo,
utilizaremos el número de papas y el número de choclos que tenemos actualmente
en el almacén sabiendo que cada persona consume 1/4 kilo de papas y 1/4kilo de
choclos (con cada kilo de papas y choclos se atiende a 4 clientes).
Será necesario crear una clase almacén, y el programa principal con un menú que
gestionará todas las peticiones anteriores.
 */
public class RestauranteAlmacen {
    // 1. Atributos
    double papas;
    double choclos;

    // 2. Constructores
    public RestauranteAlmacen(double papas, double choclos) {
        this.papas = papas;
        this.choclos = choclos;
    }

    // Constructor por defecto
    public RestauranteAlmacen() {}

    // 3. Los métodos
    // Añadir papas: Guardar kg de papas en almacén (añadiéndolos a los que ya tengamos en el almacén)
    public void anyadirPapas(double papas) {
        this.papas += papas;
        //this.papas = this.papas + papas;
    }

    // Mostrar almacén papas: Muestra por pantalla los kilos de papas que hay en el almacén.
   public void mostrarPapas() {
       System.out.println("Número de papas: " + papas);
   }

    // Merma de papas: Restamos los kg de papas que se han estropeado y se han tirado a la basura, del total que tenemos en el almacén.
    public void mermaPapas(double papas) {
        this.papas -= papas;
    }

    //Añadir choclos: Guardar kg de choclos en almacén (añadiéndolos a los que ya tengamos en el almacén)
    //Mostrar almacén choclos: Muestra por pantalla los kilos de choclos que hay en el almacén.
    //Merma de choclos: Restamos los kg de choclos que se han estropeado y se han tirado a la basura, del total que tenemos en el almacén.
    public void anyadirChoclos(double choclos){
        this.choclos += choclos;
    }

    public void mostrarChoclos() {
        System.out.println("Número de choclos: " + choclos);
    }

    public void mermaChoclos(double choclos) {
        this.choclos -= choclos;
    }

    // Devuelve el número de clientes que puede atender el restaurante: Para calcularlo,
    //utilizaremos el número de papas y el número de choclos que tenemos actualmente
    //en el almacén sabiendo que cada persona consume 1/4 kilo de papas y 1/4 kilo de
    //choclos (con cada kilo de papas y choclos se atiende a 4 clientes).
    public int numeroClientes() {
        double minimo;
        if( papas < choclos ) minimo = papas;
        else minimo = choclos;

        int personas = (int)(minimo*4);
        return personas;
    }
}
