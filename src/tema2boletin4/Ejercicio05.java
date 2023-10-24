package tema2boletin4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creamos nuestras variables
		int min = 1;
		int max = 101;
		int nMaquina;
		// Iniciamos un string
		String eleccion;
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		// Creamos un numero random
		Random rand = new Random();
		// Lo resolvemos mediante un do-while
		do {
			nMaquina = rand.nextInt(min, max);
			System.out.println("Es este numero: " + nMaquina + "  (Indique si es MAYOR, MENOR o IGUAL)");
			eleccion = sc.nextLine();
			// Creamos un if-else para poner condiciones
			if (eleccion.equals("MAYOR")) {
				min = nMaquina + 1;
			} else if (eleccion.equals("MENOR")) {
				max = nMaquina;
			}
		} while (!eleccion.equals("IGUAL") && min != max);
		// Señalamos cuando adivine el numero que pasara
		System.out.println("¡LO ADIVINE!");
		// Cerramos el Scanner
		sc.close();

	}

}
