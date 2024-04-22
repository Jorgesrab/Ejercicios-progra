package Parte_2.Ejercicios_pooAvanzado.Ejercicio4_Mascotas;

public class Canario extends Aves{

    private String color;
    private boolean canta;
    public Canario() {
    }

    public Canario(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    @Override
    public String toString() {
        return "Canario{" +
                "color='" + color + '\'' +
                ", canta=" + canta +
                "} " + super.toString();
    }

    @Override
    public void volar() {
        System.out.println("hasta nuncaaaa");
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
        System.out.println("piopiopiop");
    }
}
