package Parte_1.Entornos;

public class Temporizador {
    public long inicio;
    public boolean corriendo;

    public void iniciar() {
        //Guardamos en inicio el valor de milisegundos en el momento de ejecución
        this.inicio = System.currentTimeMillis();
        //activamos el indicador de corriendo a true, como si fuera el botón de arranque
        this.corriendo = true;
    }

    public void detener() {
        //guardamos en inicio el valor en segundos del tiempo transcurrido
        this.inicio = tiempoTranscurrido();
        //paramos el indicador de corriendo
        this.corriendo = false;
    }

    public void resetear() {
        this.inicio = 0;
        this.corriendo = false;
    }

    public long tiempoTranscurrido() {
	/*Si hemos ejecutado iniciar previamente, se calcula los milisegundos del momento
	menos los milisegundos de inicio, y se divide por 1000 para que nos den los segundos que han transcurrido*/
        if (corriendo) {
            return (System.currentTimeMillis() - inicio) / 1000;
        }
        //si no había sido iniciado, devuelve los segundos de inicio
        return inicio / 1000;
    }
}