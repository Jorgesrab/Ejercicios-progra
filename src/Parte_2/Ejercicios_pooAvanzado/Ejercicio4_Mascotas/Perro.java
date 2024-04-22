package Parte_2.Ejercicios_pooAvanzado.Ejercicio4_Mascotas;

public class Perro extends Mascotas{
    private String raza;
    private boolean pulgas;



    public Perro() {
    }

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgadas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgadas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", pulgadas=" + pulgas +
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
        System.out.println("guau guau guau!!");

    }

}
