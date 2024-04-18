package Parte_2.Ejercicios_pooAvanzado.Ejercicio3_Astros;

import java.util.ArrayList;

public class Planeta extends Astro{
    private double distanciaSol;
    private double orbitaAlSol;
    private boolean tieneSatelites;
    private ArrayList<Satelite> Satelites;

    public Planeta(String nombre, double radio, double rotacion, double masa, double temperaturaMedia, double gravedad, double distanciaSol, double orbitaAlSol) {
        super(nombre, radio, rotacion, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaAlSol = orbitaAlSol;
        Satelites = new ArrayList<Satelite>();


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


    public void muestra(){
        System.out.println(getNombre());

    }

    public void addSatelite (Satelite nombre){
        Satelites.add(nombre);

    }
}
