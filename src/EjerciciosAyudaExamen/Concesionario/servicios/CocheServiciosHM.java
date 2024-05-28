package EjerciciosAyudaExamen.Concesionario.servicios;

import cochesHM.modelo.Coche;

import java.util.*;

public class CocheServiciosHM implements ICocheServicios{
    private static HashMap<String, Coche> misCochesHM = new HashMap<>();

    public Coche buscarCochePorMatricula (String matricula) {
        return misCochesHM.get(matricula);
    }

    public void anadirCoche(Coche coche) {
        misCochesHM.put(coche.getMatricula(), coche);
    }

    public boolean eliminarCoche(String matricula) {
        if (misCochesHM.remove(matricula) != null) {
            return true;
        } else {
            return false;
        }
    }



    public ArrayList<Coche> obtenerTodos(int tipo) {
        if (tipo == 1) {
            return ordenadosPorMarca();
        } else {
            return ordenadosPorMatricula();
        }
    }

    private ArrayList<Coche> ordenadosPorMatricula() {
        Comparator<Coche> comparadorMatricula = new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                Coche c1 = (Coche) o1;
                Coche c2 = (Coche) o2;
                String matr1 = c1.getMatricula();
                String matr2 = c2.getMatricula();
                return matr1.compareTo(matr2);
            }
        };

        ArrayList<Coche> coches = new ArrayList<>(misCochesHM.values());
        Collections.sort(coches, comparadorMatricula);
        return coches;

    }
    private ArrayList<Coche> ordenadosPorMarca() {
        Comparator<Coche> comparadorMarca = new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                Coche c1 = (Coche) o1;
                Coche c2 = (Coche) o2;
                String m1 = c1.getMarca();
                String m2 = c2.getMarca();
                return m1.compareTo(m2);
            }
        };
        ArrayList<Coche> coches = new ArrayList<>(misCochesHM.values()); //obtengo los objetos del HM
        Collections.sort(coches, comparadorMarca); //lo ordeno
        return coches; //lo devuelvo
    }

    public ArrayList<Coche> obtenerCochesMarca(String marca) {
        ArrayList<Coche> cochesMarca = new ArrayList<>();
        for (Coche c: misCochesHM.values()) {
            if (c.getMarca().equalsIgnoreCase(marca)) {
                cochesMarca.add(c);
            }
        }
        return cochesMarca;
    }

}

