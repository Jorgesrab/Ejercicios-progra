package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

public class Peso {
    public static final  String[] LISTA_UNIDADES = {"libras", "lingotes", "onzas", "peniques", "kilos", "gramos", "quintales"};
    public static final double[] LISTA_CONVERSION = {0.453, 14.59, 0.02835, 0.00155, 1, 0.001, 43.3};
    private double kilos;
    public Peso(double kilos) { this.kilos=kilos;}

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public double getLibras() {
        return kilos/0.453;
    }
    public double getPeso(String unidades) {
        double resultado;
        resultado = switch(unidades) {
            case "libras" -> {
                yield getLibras();
            }
            case "lingotes" -> {
                yield kilos/14.59;
            }
            case "onzas" -> {
                yield kilos/0.02835;
            }
            case "peniques" -> {
                yield kilos/0.00155;
            }
            case "kilos" -> {
                yield kilos;
            }
            case "gramos" -> {
                yield kilos/1000;
            }
            case "quintales" -> {
                yield kilos/43.3;
            }
            default -> {
                yield 0;
            }
        };
        // Otra forma
        for (int i = 0; i < LISTA_UNIDADES.length ; i++) {
            if(unidades.equalsIgnoreCase(LISTA_UNIDADES[i])) {
                resultado = kilos/LISTA_CONVERSION[i];
            }
        }

        return resultado;
    }
}
