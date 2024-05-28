package EjerciciosAyudaExamen.Concesionario.modelo;

import java.util.Objects;

public class Coche {
    private String color;
    private String marca;
    private String modelo;
    private String matricula;
    private int numPuertas;

    public Coche() {
    }

    public Coche(String color, String marca, String modelo, String matricula, int numPuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.numPuertas = numPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Coche:" +
                "\n- Marca: " + marca+
                "\n- Modelo: " + modelo+
                "\n- Color: " + color +
                "\n- Matrícula: " + matricula +
                "\n- Número de Puertas: " + numPuertas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(getMatricula(), coche.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

}
