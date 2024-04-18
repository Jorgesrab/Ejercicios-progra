package Parte_2.Entornos.Ejercicios_pooAvanzado.Ejercicio3_Astros;

import java.util.ArrayList;

public class Planeta extends Astro{
    private double distanciaSol;
    private double orbitaAlSol;
    private boolean tieneSatelites;
    private ArrayList<Satelite> Satelites;

    public Planeta(String nombre, double radio, double rotacion, double masa, double temperaturaMedia, double gravedad, double distanciaSol, double orbitaAlSol, boolean tieneSatelites, ArrayList<Satelite> satelites) {
        super(nombre, radio, rotacion, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaAlSol = orbitaAlSol;
        this.tieneSatelites = tieneSatelites;
        Satelites = satelites;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getOrbitaAlSol() {
        return orbitaAlSol;
    }

    public void setOrbitaAlSol(double orbitaAlSol) {
        this.orbitaAlSol = orbitaAlSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    public ArrayList<Satelite> getSatelites() {
        return Satelites;
    }

    public void setSatelites(ArrayList<Satelite> satelites) {
        Satelites = satelites;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "distanciaSol=" + distanciaSol +
                ", orbitaAlSol=" + orbitaAlSol +
                ", tieneSatelites=" + tieneSatelites +
                ", Satelites=" + Satelites +
                "} " + super.toString();
    }

    public void muestra(){
        System.out.println(toString());

    }
}
