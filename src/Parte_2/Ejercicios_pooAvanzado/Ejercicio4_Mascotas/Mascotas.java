package Parte_2.Ejercicios_pooAvanzado.Ejercicio4_Mascotas;

public abstract class Mascotas {
    private String nombre;
    private int edad;
    private String estado;
    private String fechaNacimiento;

    public Mascotas() {
    }

    public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract void muestra();
    public abstract void  cumpleanios();
    public abstract void morir();
    public abstract void  habla();

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estado='" + estado + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}

