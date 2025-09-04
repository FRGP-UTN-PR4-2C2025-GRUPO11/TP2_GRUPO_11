package ejercicio2;

public class EdificioOficinas implements IEdificio{
	private int cantidadOficinas;
	private double superficie;
	
	public EdificioOficinas(double superficie, int cantidadOficinas) {
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
