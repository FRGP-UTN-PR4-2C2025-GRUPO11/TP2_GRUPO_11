package ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		Persona obj = new Persona();
		Persona obj2 = new Persona();
		try{
			obj.setDni("AA202020");
			obj2.setDni("20202020");
			Persona.verificarDNI(obj.getDni());
			Persona.verificarDNI(obj2.getDni());
			System.out.println("Persona agregada correctamente");
			}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Persona no agregada por no verificar el DNI");
		}
		
		
	}

}
