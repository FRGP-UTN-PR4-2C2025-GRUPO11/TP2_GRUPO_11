package ejercicio2;

public class Polideportivo implements IEdificio{

	private double superficieEdificio;
	String nombre;

	
	
	
	public Polideportivo(String nombre, double superficieEdificio) {
		super();
		this.nombre = nombre;
		this.superficieEdificio = superficieEdificio;
	}


	public double getSuperficie() {
		return superficieEdificio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setSuperficie(double superficie) {
		this.superficieEdificio = superficie;
	}


	public void setSuperficieEdificio(double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public double getSuperficieEdificio() {
		return superficieEdificio;
	}


	@Override
	public String toString() {
		return "Polideportivo " + nombre + ". Superficie= " + superficieEdificio + " m2";
	}
	
	
	
}
