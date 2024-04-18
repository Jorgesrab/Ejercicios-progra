package Parte_2.Ejercicios_pooAvanzado.Ejercicio1_Composicion;

public class Empresa {
    String nombre;
    String cif;


    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", cif='" + cif + '\'' +
                '}';
    }
}

