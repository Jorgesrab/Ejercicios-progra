package EjerciciosAyudaExamen.Examen.servicios;

import modelos.*;
import EjerciciosAyudaExamen.Examen.utiles.ComparatorVehiculoMarca;
import EjerciciosAyudaExamen.Examen.utiles.Constantes;
import java.util.ArrayList;
import java.util.Collections;

public class Servicio implements IServicio{

    @Override
    public boolean addEmpleado(Empleado empleado) {
        boolean resultado = false;
        if( empleados.containsKey(empleado.getUsuario()) ) {
            System.out.println("Error: El empleado ya existe");
        } else {
            empleados.put(empleado.getUsuario(), empleado);
            System.out.println("Empleado insertado correctamente");
            resultado = true;
        }
        return resultado;
    }

    /**
     * Añade una persona a la colección correspondiente. Puede ser o no Empleado
     * Previamente comprueba que no esté ya dado de alta
     * Si es Empleado, llama al método correspondiente
     * @param persona
     * @return true si se ha añadido, false si no
     */
    @Override
    public boolean addPersona(Persona persona) {
        if( empleados.values().contains(persona)) {
            System.out.println(Constantes.ERR_PERSONA_EXISTE);
            return false;
        }
        if( persona instanceof Empleado ) {
            return addEmpleado((Empleado) persona);
        }
        boolean resultado = false;
        if( personas.containsKey(persona.getDNI())) {
            System.out.println(Constantes.ERR_PERSONA_EXISTE);
        } else {
            personas.put(persona.getDNI(), persona);
            System.out.println(Constantes.MSG_INSERTAR_PERSONA_OK);
            resultado =true;
        }
        return resultado;
    }

    /**
     * Añade un vehiculo comprobando previamente que no está ya
     * @param vehiculo
     * @return true si se ha añadido, false si no
     */
    @Override
    public boolean addVehiculo(Vehiculo vehiculo) {
        boolean resultado = false;
        if( vehiculos.containsKey(vehiculo.getMatricula()) ) {
            System.out.println(Constantes.ERR_VEHICULO_EXISTE);
        } else {
            vehiculos.put(vehiculo.getMatricula(), vehiculo);
            System.out.println(Constantes.MSG_INSERCION_VEHICULO_OK);
            resultado = true;
        }
        return resultado;
    }

    /**
     * Devuelve un empleado consultando por su usuario
     * @param usuario
     * @return el Empleado si existe, null si no
     */
    @Override
    public Empleado getEmpleado(String usuario) {
        return empleados.get(usuario);
    }

    /**
     * Comprueba si un usuario está dado de alta
     * @param usuario
     * @return true si lo está, false en otro caso
     */
    @Override
    public boolean existeEmpleado(String usuario) {
        return empleados.containsKey(usuario);
    }

    /**
     * Elimina un vehiculo existente si no está alquilado
     * @param matricula
     * @return true si se ha podido eliminar, false en otro caso
     */
    @Override
    public boolean eliminarVehiculo(String matricula) {
        if( !vehiculos.containsKey(matricula )) {
            System.out.println(Constantes.ERR_VEHICULO_NO_EXISTE);
            return false;
        }
        Vehiculo vehiculo = vehiculos.get(matricula);
        if( vehiculo.isAlquilado() ) {
            System.out.println(Constantes.ERR_VEHICULO_YA_ALQUILADO);
            return false;
        }
        System.out.println("Vehículo eliminado correctamente");
        vehiculos.remove(matricula);
        return true;
    }

    /**
     * Lista de todos los vehiculos ordenados por marca
     * @return lista ordenada de Vehiculos de alta
     */
    @Override
    public ArrayList<Vehiculo> getVehiculosPorMarca() {
        ArrayList<Vehiculo> lista = new ArrayList<>(vehiculos.values());
        Collections.sort(lista, new ComparatorVehiculoMarca());
        return lista;
    }

    @Override
    public ArrayList<Vehiculo> getVehiculosPorMatricula(boolean alquilados) {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        for (Vehiculo v: vehiculos.values()) {
            // Añadir alquilados o no alquilados según el valor del parámetro
            if( alquilados && v.isAlquilado()) lista.add(v);
            else if (!alquilados && !v.isAlquilado()) lista.add(v);
        }
        // Ordenamos por orden definido en Vehiculo
        Collections.sort(lista);
        return lista;
    }

    @Override
    public ArrayList<Persona> obtenerClientes() {
        ArrayList<Persona> lista = new ArrayList<>(personas.values());
        return lista;
    }

    @Override
    public boolean alquilarVehiculo (String matricula, String dni, int numDias) {
        if( !vehiculos.containsKey(matricula)) {
            System.out.println(Constantes.ERR_VEHICULO_NO_EXISTE);
            return false;
        }
        Vehiculo vehiculo = vehiculos.get(matricula);
        if(vehiculo.isAlquilado() ) {
            System.out.println(Constantes.ERR_VEHICULO_YA_ALQUILADO);
            return false;
        }
        if( !personas.containsKey(dni)) {
            System.out.println(Constantes.ERR_CLIENTE_NO_EXISTE);
            return false;
        }
        Cliente cliente = (Cliente)personas.get(dni);
        double precio = vehiculo.alquilar(cliente,numDias);
        cliente.alquilar(vehiculo);
        System.out.println("“Vehículo alquilado por " + cliente.getNombre() + ". El precio es: " + precio);
        return true;
    }

    @Override
    public boolean desAlquilarVehiculo(String matricula) {
        if( !vehiculos.containsKey(matricula)) {
            System.out.println(Constantes.ERR_VEHICULO_NO_EXISTE);
            return false;
        }
        Vehiculo vehiculo = vehiculos.get(matricula);
        if(!vehiculo.isAlquilado()) {
            System.out.println(Constantes.ERR_VEHICULO_NO_ALQUILADO);
            return false;
        }
        vehiculo.desalquilar();
        Cliente c = vehiculo.getCliente();
        c.desalquilar(vehiculo);
        System.out.println("Vehiculo con matrícula " + matricula + " ya no está alquilado");
        return true;
    }


}
