package ejercicio2;

public class EdificioOficinas implements IEdificio{
	private int cantidadOficinas;
	private double superficie;
	private String nombre;
	
	public EdificioOficinas(String nombre, double superficie, int cantidadOficinas) {
		this.nombre = nombre;
        this.superficie = superficie;
        this.cantidadOficinas = cantidadOficinas;
    }
	
	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}
	
	public int getCantidadOficinas() {
		return cantidadOficinas;
	}

	@Override
	public String toString() {
		return "Edificio de Oficinas: Numero de Oficinas = " + cantidadOficinas + ", superficie = " + superficie + " m2";
	}
	
}
