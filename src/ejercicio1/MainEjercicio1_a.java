package ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		
		
		// Probamos con DNI = AA202020
		Persona persona1 = new Persona();
		try{
			persona1.setDni("AA202020");
			Persona.exVerificarDNI(persona1.getDni());
			System.out.println("Persona agregada correctamente");
			}
		catch(Exception e) {
			System.out.println("Persona no agregada por no verificar el DNI");
		}
		
		// Probamos con DNI = 20202020
		Persona persona2 = new Persona();
		try{
			persona2.setDni("20202020");
			Persona.exVerificarDNI(persona2.getDni());
			
			System.out.println("Persona agregada correctamente");
			}
		catch(Exception e) {
			System.out.println("Persona no agregada por no verificar el DNI");
		}
	}

}
