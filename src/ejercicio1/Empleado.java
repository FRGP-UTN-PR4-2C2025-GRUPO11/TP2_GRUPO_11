package ejercicio1;

import java.time.LocalDate;
import java.util.*;

/**
 *
 */
public class Empleado extends Persona implements Comparable<Empleado> {
	private final int legajo;
	private String puesto;
	static int contador=999;

	// Constructors:
	public Empleado() {
		super();
		contador++;
		this.legajo = contador;
	}

	public Empleado(String dni, String nombre, String apellido, LocalDate
			fechaNacimiento, String genero, String direccion, String telefono, String email,
			 String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		contador++;
		this.legajo = contador;
		this.puesto = puesto;
	}

	// Getters and setters
	public int getLegajo() {
		return legajo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	// to string
	@Override
	public String toString() {
		return super.toString() + "\nEmpleado [LEGAJO=" + legajo + ", PUESTO=" + puesto + "]\n";
	}

	//metodo estatico

	public static int devuelveProximoLegajo() {
		return contador+1;
	}

	public static void listadoEmpleados(Empleado[] vEmpleados) {
		if (vEmpleados == null || vEmpleados.length == 0) {
	        System.out.println("No hay empleados para mostrar.");
	        return;
	    }

		for (Empleado e : vEmpleados)
		{
			System.out.println(e.toString());
		}
	}

	public static void buscarEmpleadoPorLegajo(Empleado[] vEmpleados, int legajo) {
		if (vEmpleados == null || vEmpleados.length == 0) {
	        System.out.println("No hay empleados para mostrar.");
	        return;
	    }

		for (Empleado e : vEmpleados)
		{
			if(e.getLegajo() == legajo)
			{
				System.out.println(e.toString());
			}
		}
	}


	/**
	 * Método abstracto que lista los empleados filtrados por palabra clave y los imprime en consola.
	 * @param vEmpleados vector con el listado de empleados
	 * @param palabraClave palabra clave a buscar
	 * Imprime el resultado en consola
	 */
	public static void listadoEmpleados(Empleado[] vEmpleados, String palabraClave) {
		if (vEmpleados == null || vEmpleados.length == 0) {
	        System.out.println("No hay empleados para mostrar.");
	        return;
	    }
		int contador = 1;
		for (Empleado e : vEmpleados)
		{
			if ( ( e.getApellido() != null && e.getApellido().contains(palabraClave) ) ||
					( e.getNombre() != null && e.getNombre().contains(palabraClave) ) ||
					( e.getDireccion() != null && e.getDireccion().contains(palabraClave) ) ||
					( e.getDni() != null && e.getDni().contains(palabraClave) ) ||
					( e.getPuesto() != null && e.getPuesto().contains(palabraClave) )
				)
			{
				System.out.println(contador + ". " + e.toString());
				contador++;
			}
		}
		contador--;
		System.out.println("Se encontraron " + contador + " resultados que coinciden con '" + palabraClave+ "'.");
	}


	@Override
	public int compareTo(Empleado empleado) {
		if (this.legajo < empleado.legajo) {
			return -1; // this is "menor"
		} else if (this.legajo > empleado.legajo) {
			return 1; // this is "mayor"
		}else {
			return 0;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(legajo, puesto);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return legajo == other.legajo && Objects.equals(puesto, other.puesto);
	}
	
}
