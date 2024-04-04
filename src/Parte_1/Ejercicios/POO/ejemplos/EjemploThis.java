package Parte_1.Ejercicios.POO.ejemplos;

public class EjemploThis {
    // 1. Atributos
    Perro perro;
    int numeroPerros;

    // 2. Constructores
    public EjemploThis(Perro perro, int numeroPerros) {
        // this se refiere a la clase Perro
        // this.perro es el atributo
        // perro es el parámetro de entrada del constructor
        this.perro = perro;
        this.numeroPerros = numeroPerros;
    }

    // 3. Resto de los metodos
    public static void main(String[] args) {
        Perro perro;


        //EjemploThis nuevo = new EjemploThis(perro, 4);

    }
}
