package Parte_2.Ejercicios_pooAvanzado.Ejercicio1_Composicion;

public class Empleado{
    String dni;
    String nombre;
    int edad;
    double sueldoBruto;
    String categoria;
    Departamento departamento;


    public Empleado(String dni, String nombre, int edad, double sueldoBruto, String categoria, Departamento departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldoBruto = sueldoBruto;
        this.categoria = categoria;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sueldoBruto=" + sueldoBruto +
                ", categoria='" + categoria + '\'' +
                ", departamento=" + departamento +
                '}';
    }

    public double sueldoNeto(double retencion){
        return this.sueldoBruto - (this.sueldoBruto*retencion/100);
    }
}
