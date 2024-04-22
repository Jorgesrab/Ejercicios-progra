package Parte_2.Ejercicios_pooAvanzado.Ejercicio4_Mascotas;

public class Loro extends Aves{

    private String origen;
    private boolean habla;

    public Loro() {
    }

    public Loro(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    @Override
    public String toString() {
        return "Loro{" +
                "origen='" + origen + '\'' +
                ", habla=" + habla +
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
        System.out.println("pio pio pio");

    }

    public void saluda(){
        System.out.println("Hola buenas tardes");

    }

}
