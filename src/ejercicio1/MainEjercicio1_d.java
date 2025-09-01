package ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {

	public static void main(String[] args) {
		HashSet<Empleado> empleados = new HashSet<Empleado>();
		
		empleados.add(new Empleado("1111", "Carlos", "Gómez", LocalDate.of(1995, 5, 12),
				"M", "Calle Falsa 123", "111-222", "carlos@mail.com", "Programador"));
		empleados.add(new Empleado("2222", "Ana", "Martínez", LocalDate.of(1990, 7, 20),
				"F", "Av. Siempre Viva 456", "222-333", "ana@mail.com", "Diseñadora"));
		empleados.add(new Empleado("3333", "Luis", "Pérez", LocalDate.of(1985, 3, 10),
				"M", "San Martín 789", "333-444", "luis@mail.com", "Tester QA"));
		empleados.add(new Empleado("4444", "María", "Rodríguez", LocalDate.of(1992, 1, 30),
				"F", "Belgrano 101", "444-555", "maria@mail.com", "Analista"));
		empleados.add(new Empleado("5555", "Jorge", "Fernández", LocalDate.of(1998, 11, 15),
				"M", "Mitre 202", "555-666", "jorge@mail.com", "Soporte"));
		
		
		Iterator<Empleado> it = empleados.iterator();
		while(it.hasNext())
		{
			Empleado p = (Empleado) it.next();
			System.out.println(p.toString());
		}

	}

}
