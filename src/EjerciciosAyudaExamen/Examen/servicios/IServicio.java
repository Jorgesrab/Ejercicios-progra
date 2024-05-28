package EjerciciosAyudaExamen.Examen.servicios;

import EjerciciosAyudaExamen.Examen.modelos.Empleado;
import EjerciciosAyudaExamen.Examen.modelos.Persona;
import EjerciciosAyudaExamen.Examen.modelos.Vehiculo;

import java.util.ArrayList;
import java.util.HashMap;

public interface IServicio {
    HashMap<String, Empleado> empleados = new HashMap<>();
    HashMap<String, Persona> personas = new HashMap<>();
    HashMap<String, Vehiculo>  vehiculos = new HashMap<>();

    boolean addEmpleado(Empleado empleado);
    boolean addPersona(Persona persona);
    boolean addVehiculo(Vehiculo vehiculo);

    Empleado getEmpleado(String usuario);
    boolean existeEmpleado(String usuario);
    boolean eliminarVehiculo(String matricula);
    ArrayList<Vehiculo> getVehiculosPorMarca();
    ArrayList<Vehiculo> getVehiculosPorMatricula(boolean alquilados);
    ArrayList<Persona> obtenerClientes();
    boolean alquilarVehiculo(String matricula, String dni, int numDias);
    boolean desAlquilarVehiculo(String matricula);

}
