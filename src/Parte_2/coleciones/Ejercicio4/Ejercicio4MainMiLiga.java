package Parte_2.coleciones.Ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio4MainMiLiga {
    public static void main(String[] args) {
        // b) Crear un ArrayList que almacenará los partidos
        ArrayList<Partido> partidos = new ArrayList<>();

        // c) Instanciar los 8 partidos
        partidos.add(new Partido("Guadalcacín F.S.", "Leganés FSF", 1, 7));
        partidos.add(new Partido("Jimbee Roldán F.S.F.", "F.S.F. Mostoles", 2, 2));
        partidos.add(new Partido("Burela F.S.", "A.D. Sala Zaragoza F.S.", 2, 0));
        partidos.add(new Partido("A.E. Penya Esplugues", "Viaxes Amarelle F.S.", 1, 0));
        partidos.add(new Partido("Femisport Palau Club", "Poio Pescamar F.S.", 2, 2));
        partidos.add(new Partido("Majadahonda F.S.F.", "C.D. Universidad De Alicante", 1, 6));
        partidos.add(new Partido("C.D. Futsi Atletico Feminas", "UCAM El Pozo Murcia FS", 8, 0));
        partidos.add(new Partido("A. D. Alcorcón F.S.", "Ourense Envialia C.F.", 3, 4));

        // d) Mostrar los resultados de los partidos usando un Iterator
        System.out.println("Resultados de los partidos:");
        Iterator<Partido> iterator = partidos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // e) Contar victorias locales, victorias visitantes y empates
        int victoriasLocales = 0;
        int victoriasVisitantes = 0;
        int empates = 0;
        Partido mayorGoleada = null;
        String equipoMasGoles = "";
        int maxGoles = 0;

        for (Partido partido : partidos) {
            if (partido.getGolesLocal() > partido.getGolesVisitante()) {
                victoriasLocales++;
            } else if (partido.getGolesLocal() < partido.getGolesVisitante()) {
                victoriasVisitantes++;
            } else {
                empates++;
            }

            // Determinar la mayor goleada
            int diferenciaGoles = Math.abs(partido.getGolesLocal() - partido.getGolesVisitante());
            if (mayorGoleada == null || diferenciaGoles > Math.abs(mayorGoleada.getGolesLocal() - mayorGoleada.getGolesVisitante())) {
                mayorGoleada = partido;
            }

            // Determinar el equipo con más goles
            if (partido.getGolesLocal() > maxGoles) {
                maxGoles = partido.getGolesLocal();
                equipoMasGoles = partido.getEquipoLocal();
            }
            if (partido.getGolesVisitante() > maxGoles) {
                maxGoles = partido.getGolesVisitante();
                equipoMasGoles = partido.getEquipoVisitante();
            }
        }

        System.out.println("Número de victorias locales: " + victoriasLocales);
        System.out.println("Número de victorias visitantes: " + victoriasVisitantes);
        System.out.println("Número de empates: " + empates);
        System.out.println("Mayor goleada: " + mayorGoleada);
        System.out.println("Equipo con más goles: " + equipoMasGoles);

        // f) Eliminar los partidos que no sean empates
        iterator = partidos.iterator();
        while (iterator.hasNext()) {
            Partido partido = iterator.next();
            if (partido.getGolesLocal() != partido.getGolesVisitante()) {
                iterator.remove();
            }
        }

        // g) Mostrar los partidos que quedan (los empates)
        System.out.println("Partidos que son empates:");
        iterator = partidos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------------");

    }
}
