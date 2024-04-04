package Parte_1.Ejercicios.POO.ejemplos;

// clase Perro
public class Perro {
    // 1. Miembros o Atributos
    String breed;
    String size;
    int age;
    String color;

    //2. Constructor por defecto
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
    //No recibe parámetros pero devuelve un dato String
    public String getInfo() {
        String info = "Raza: "+breed+" Tamaño:"+size+" Edad:"+age+" Color: "+color;
        return info;
    }

    // método para sacar caracteristicas de un perro
    //No recibe parámetros ni devuelve datos
    public void getInfo2() {
        System.out.println("Raza: "+breed+" Tamaño:"+size+" Edad:"+age+" Color: "+color);
    }

    // método para cambiar la edad del perro
    //Recibe un parámetro pero no devuelve nada
    public void setEdad(int edadNueva) {
        age = edadNueva;
    }

    // método para cambiar la edad del perro
    //Recibe un parámetro y devuelve un String de salida
    public String setEdad2(int edadNueva) {
        age = edadNueva;
        return "Edad cambiada correctamente";
    }


    public static void main(String[] args) {
        //Creamos un objeto de Perro con el constructor por defecto
        Perro maltes = new Perro();

        //ponemos valores a los atributos del objeto
        maltes.breed="Maltes";
        maltes.size="Small";
        maltes.age=2;
        maltes.color="white";

        //Probamos todos los métodos del objeto
        //Devuelve un String
        System.out.println(maltes.getInfo());

        //no devuelve nada
        maltes.getInfo2();

        //Recibe un valor de tipo int pero no devuelve nada
        maltes.setEdad(8);

        //Recibe un valor de tipo int y devuelve un String
        System.out.println(maltes.setEdad2(12));
        maltes.getInfo2();

        //Probamos a crear otro objeto con el otro constructor
        Perro labrador = new Perro("Labrador","Medium", 3, "Brown");
        //comprobamos que el objeto labrador puede ejecutar los métodos igual
        labrador.getInfo2();

        Perro pastor = new Perro("Pastor", "Grande", 4, "Blanco");
        pastor.getInfo2();
        pastor.setEdad(5);
        pastor.getInfo2();
    }
}
