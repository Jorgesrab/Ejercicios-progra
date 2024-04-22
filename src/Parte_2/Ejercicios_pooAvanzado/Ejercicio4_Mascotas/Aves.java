package Parte_2.Ejercicios_pooAvanzado.Ejercicio4_Mascotas;

public abstract class Aves extends Mascotas {
    private String pico;
    private boolean vuela;

    public Aves() {
    }

    public Aves(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    @Override
    public String toString() {
        return "Aves{" +
                "pico=" + pico +
                ", vuela=" + vuela +
                "} " + super.toString();
    }

    public abstract void volar();
}
