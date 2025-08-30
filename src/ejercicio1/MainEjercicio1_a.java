package ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		Persona obj = new Persona();
		try{
			obj.setDni("AA202020");
			Persona.verificarDNI(obj.getDni());
			System.out.println("Funciona bien");
			}
		finally {}
		
	}

}
