package ejercicio2;
import java.util.*;

public class mainEjercicio2 {

	public static void main(String[] args) {
		ArrayList<IEdificio> grupo = new ArrayList<>(5);
		grupo.add(new Polideportivo("Ejemplo1", 300));
		grupo.add(new Polideportivo("Ejemplo2", 200));
		grupo.add(new Polideportivo("Ejemplo3", 250));
		grupo.add(new EdificioOficinas("Ejemplo4", 100, 10));
		grupo.add(new EdificioOficinas("Ejemplo5", 200, 20));
		Iterator<IEdificio> it = grupo.iterator();
		while(it.hasNext()) {
			IEdificio obj = it.next();
			System.out.println(obj.toString());
		}
	}
}
