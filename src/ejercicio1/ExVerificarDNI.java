package ejercicio1;

public class ExVerificarDNI extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "El DNI no es válido";
	}

}
