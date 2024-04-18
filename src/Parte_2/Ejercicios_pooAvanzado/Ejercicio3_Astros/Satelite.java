package Parte_2.Ejercicios_pooAvanzado.Ejercicio3_Astros;

public class Satelite extends Astro {
    private double distanciaPlantea;
    private double orbitaPlaneta;
    private Planeta planeta;

    public Satelite(String nombre, double radio, double rotacion, double masa, double temperaturaMedia, double gravedad, double distanciaPlantea, double orbitaPlaneta, Planeta planeta) {
        super(nombre, radio, rotacion, masa, temperaturaMedia, gravedad);
        this.distanciaPlantea = distanciaPlantea;
        this.orbitaPlaneta = orbitaPlaneta;
        this.planeta = planeta;
    }

    public double getDistanciaPlantea() {
        return distanciaPlantea;
    }

    public void setDistanciaPlantea(double distanciaPlantea) {
        this.distanciaPlantea = distanciaPlantea;
    }

    public double getOrbitaPlaneta() {
        return orbitaPlaneta;
    }

    public void setOrbitaPlaneta(double orbitaPlaneta) {
        this.orbitaPlaneta = orbitaPlaneta;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }



}
