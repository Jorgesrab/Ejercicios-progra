package Parte_1.Ejercicios.POO.ejemplos.base;

// clase Perro
public class Perro {
    // Miembros o Atributos
    String breed;
    String size;
    int age;
    String color;
    //Constructor por defecto
    Perro (){
        breed="";
        size="";
        age=0;
        color="";
    }
    //Constructor con parámetros de entrada
    Perro (String raza, String talla, int edad, String colour){
        breed=raza;
        size=talla;
        age=edad;
        color=colour;
    }
    // método para sacar caracteristicas de un perro
    public String getInfo() {
        return ("Raza: "+breed+" Tamaño:"+size+" Edad:"+age+" Color: "+color);
    }

    public static void main(String[] args) {
        Perro maltes1 = new Perro();
        Perro maltes2 = new Perro("Maltes","Small",2,"white");
        System.out.println(maltes1.getInfo());
        System.out.println(maltes2.getInfo());
    }
}
