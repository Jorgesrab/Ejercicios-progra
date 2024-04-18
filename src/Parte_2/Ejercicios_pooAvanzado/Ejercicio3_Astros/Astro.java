package Parte_2.Ejercicios_pooAvanzado.Ejercicio3_Astros;

public abstract class Astro {
    private String nombre;
    private double radio;
    private double rotacion;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;


    public Astro(String nombre, double radio, double rotacion, double masa, double temperaturaMedia, double gravedad) {
        this.nombre = nombre;
        this.radio = radio;
        this.rotacion = rotacion;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public void muestra(){

    }
}
