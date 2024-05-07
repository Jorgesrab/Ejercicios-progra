package Parte_2.Ejercicios_pooAvanzado.Ejercicio9_SeleccionDeFutbol;

public abstract class SeleccionFutbol {
    private int id;
    private String nombre;
    private String appellidos;
    private int edad;


    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String appellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.appellidos = appellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppellidos() {
        return appellidos;
    }

    public void setAppellidos(String appellidos) {
        this.appellidos = appellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", appellidos='" + appellidos + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void viajar(){
        System.out.println("Viajar SuperClase");
    }
    public void concentrarse(){
        System.out.println("Concentracion SuperClase");
    }
    public void partidoFutbol(){
        System.out.println("Asiste al partido SuperClase");
    }
    public abstract void entrar();
}

