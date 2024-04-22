package Parte_2.Ejercicios_pooAvanzado.Ejercicio4_Mascotas;

public class Gato extends Mascotas{

    private String color;
    private boolean peloLargo;

    public Gato() {
    }

    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "color='" + color + '\'' +
                ", peloLargo=" + peloLargo +
                "} " + super.toString();
    }

    @Override
    public void muestra() {
        System.out.println(this.toString());

    }

    @Override
    public void cumpleanios() {

    }

    @Override
    public void morir() {

    }

    @Override
    public void habla() {
        System.out.println("miau miau miau ");

    }
}
