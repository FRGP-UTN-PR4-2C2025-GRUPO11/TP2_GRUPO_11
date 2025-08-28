package ejercicio1;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;

	// Construstors
	public Persona() {
		this.nombre = "Sin nombre";
		this.fechaNacimiento = LocalDate.parse("2025-01-01");
	};

	public Persona(String dni, String nombre, String apellido,
			LocalDate fechaNacimiento, String genero, String direccion,
			String telefono, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + getDni() + ", NOMBRE=" + getNombre() + ", APELLIDO=" + getApellido() + ", FECHA DE NACIMIENTO=" + getFechaNacimiento() + ", GENERO=" + getGenero()
		    + ", DIRECCION=" + getDireccion() + ", TELEFONO=" + getTelefono() + ", EMAIL=" + getEmail() + "]";
	}

}
