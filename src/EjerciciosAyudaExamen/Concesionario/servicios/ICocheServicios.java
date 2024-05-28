package EjerciciosAyudaExamen.Concesionario.servicios;

import cochesHM.modelo.Coche;

import java.util.ArrayList;

public interface ICocheServicios {
    Coche buscarCochePorMatricula(String matricula);

    void anadirCoche(Coche coche);

    boolean eliminarCoche(String matricula);

    ArrayList<Coche> obtenerTodos(int tipo);

    ArrayList<Coche> obtenerCochesMarca(String marca);
}
