package Parte_2.Ejercicios_pooAvanzado.Ejercicio1_Composicion;

public class Departamento {
    int id;
    String nombre;
    String localizacion;
    Empresa empresa;

    public Departamento(int id, String nombre, String localizacion, Empresa empresa) {
        this.id = id;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", empresa=" + empresa +
                '}';
    }
}
