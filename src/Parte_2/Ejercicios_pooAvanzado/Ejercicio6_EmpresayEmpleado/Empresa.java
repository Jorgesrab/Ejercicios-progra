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
            System.out.println();
            empleado.mostrar();
        }
    }




}

