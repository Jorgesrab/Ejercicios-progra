package Parte_2.Ejercicios_pooAvanzado.Ejercicio6_EmpresayEmpleado;

public class Empleado {
    final String nombre;
    final String dni;
    double sueldoBrutoM;
    int edad;
    int telefono;
    String direccion;

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldoBrutoM() {
        return sueldoBrutoM;
    }

    public void setSueldoBrutoM(double sueldoBrutoM) {
        this.sueldoBrutoM = sueldoBrutoM;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Empleado(String nombre, String dni, double sueldoBrutoM, int edad, int telefono, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBrutoM = sueldoBrutoM;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sueldoBrutoM=" + sueldoBrutoM +
                ", edad=" + edad +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public String mostrar(){
        return this.toString();
    }

    public double calculoSueldoNeto(){
        double sueldoAnual = this.sueldoBrutoM*12;

        if (sueldoAnual<12000){
            return this.sueldoBrutoM * 0.80;
        } else if (sueldoAnual >= 12000 && sueldoAnual <= 25000) {
            return this.sueldoBrutoM * 0.70;
        }else {
            return this.sueldoBrutoM * 0.60;
        }

    }

}
