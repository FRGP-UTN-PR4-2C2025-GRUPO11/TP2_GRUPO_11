package ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {

	public static void main(String[] args) {
		HashSet<Persona> personas = new HashSet<Persona>();
		
		personas.add(new Persona("1111", "Carlos", "Gómez", LocalDate.of(1995, 5, 12),
				"M", "Calle Falsa 123", "111-222", "carlos@mail.com"));
		personas.add(new Persona("2222", "Ana", "Martínez", LocalDate.of(1990, 7, 20),
				"F", "Av. Siempre Viva 456", "222-333", "ana@mail.com"));
		personas.add(new Persona("3333", "Luis", "Pérez", LocalDate.of(1985, 3, 10),
				"M", "San Martín 789", "333-444", "luis@mail.com"));
		personas.add(new Persona("4444", "María", "Rodríguez", LocalDate.of(1992, 1, 30),
				"F", "Belgrano 101", "444-555", "maria@mail.com"));
		personas.add(new Persona("5555", "Jorge", "Fernández", LocalDate.of(1998, 11, 15),
				"M", "Mitre 202", "555-666", "jorge@mail.com"));
		
		
		Iterator<Persona> it = personas.iterator();
		while(it.hasNext())
		{
			Persona p = (Persona) it.next();
			System.out.println(p.toString());
		}

	}

}
