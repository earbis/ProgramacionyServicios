package tema2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio2_4 {

	public static void main(String[] args) {
		
		List<HolaMundoMasCadena2_4> lista = new ArrayList<>();
		lista.add(new HolaMundoMasCadena2_4("Esto es una prueba"));
		lista.add(new HolaMundoMasCadena2_4("Esto es una prueba"));
		lista.add(new HolaMundoMasCadena2_4("Esto es una prueba"));
		lista.add(new HolaMundoMasCadena2_4("Esto es una prueba"));
		lista.add(new HolaMundoMasCadena2_4("Esto es una prueba"));
		
		for (Iterator<HolaMundoMasCadena2_4> iterator = lista.iterator(); iterator.hasNext();) {
			HolaMundoMasCadena2_4 holaMundoMasCadena2_4 = iterator.next();
			Thread hilo = new Thread(holaMundoMasCadena2_4);
			hilo.start();
			
			
		}
	}

}
