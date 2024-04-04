package Parte_1.Ejercicios.POO.ejemplos.base;

public class EjemploDinamico {
    int numero;
	int getNumero() {
		return numero;
	}
	void setNumero( int numero) {
		this.numero = numero;
	}
}

class TestDinamico {
    public static void main(String[] args) {
		EjemploDinamico ejemplo = new EjemploDinamico();
		System.out.println("El numero es: " + ejemplo.getNumero());
		ejemplo.setNumero(EjemploStatic.numeroAzar());
		System.out.println("El numero es: " + ejemplo.getNumero());
	}
}
