package ejercicio2;

public class Polideportivo implements IEdificio{

	private double superficie;
	private double superficieEdificio;
	String nombre;

	
	public double getSuperficie() {
		return superficie;
	}


	public String getNombre() {
		return nombre;
	}


	public void setSuperficie(double superficie) {
		this.superficie = superficie;
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
	
}
