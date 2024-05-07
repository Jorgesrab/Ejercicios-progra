package Parte_2.Ejercicios_pooAvanzado.Ejercicio6_EmpresayEmpleado;

import java.util.ArrayList;

public class Empresa {
    private final String nombre;
    private final String cif;
    private int telefono;
    private String direccion;

    private ArrayList<Empleado> empleados;


    public Empresa(String nombre, String cif, int telefono, String direccion) {
        this.nombre = nombre;
        this.cif = cif;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", cif='" + cif + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", empleados=" + empleados +
                '}';
    }

    public String mostrar(){
        return toString();
    }

    public void añadirEmpleados(Empleado empleado){
        if (empleados==null) empleados = new ArrayList<>();
        empleados.add(empleado);
    }

    public void eliminarEmpleados(Empleado empleado){
        empleados.remove(empleado);
    }

    public void mostrarEmpleados(){
        for (Empleado empleado:empleados) {
            System.out.println(empleado.mostrar());
        }
    }

    public void mostrarEmpleadosSueldo(){
        for (Empleado empleado:empleados) {
            System.out.println("DNI: "+empleado.getDni());
            System.out.println("Sueldo bruto: "+empleado.getSueldoBrutoM());
            System.out.println("Sueldo neto: "+ empleado.calculoSueldoNeto());
        }
    }

    public void brutoTotal(){
        double brutoTotal=0;
        for (Empleado empleado:empleados) {
            brutoTotal+=empleado.sueldoBrutoM;

        }
    }

    public void netoTotal(){
        double netoTotal=0;
        for (Empleado empleado:empleados) {
            netoTotal+=empleado.calculoSueldoNeto();

        }
    }




}

