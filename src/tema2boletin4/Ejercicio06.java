package tema2boletin4;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Ponemos nuestras variables
		String jugador1, jugador2, repetir;
		final String PIEDRA = "PIEDRA";
		final String TIJERAS = "TIJERAS";
		final String PAPEL = "PAPEL";
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		do {

			do {
				System.out.println("Jugador 1 elija entre: PIEDRA, PAPEL Y TIJERAS");
				jugador1 = sc.nextLine();
			} while (jugador1.equals("PIEDRA") && jugador1.equals("PAPEL") && (jugador1.equals("TIJERAS"))) ;
			
			do {
				System.out.println("Jugador 2 elija entre: PIEDRA, PAPEL Y TIJERAS");
				jugador2 = sc.nextLine();
			} while (jugador2.equals("PIEDRA") && jugador2.equals("PAPEL") && (jugador2.equals("TIJERAS"))) ;

			if (jugador1 == jugador2) {
				System.out.println("EMPATE");
			} else if (jugador1 == PIEDRA && jugador2 == PAPEL || jugador1 == PAPEL && jugador2 == PIEDRA
					|| jugador1 == TIJERAS && jugador2 == PAPEL) {
				System.out.println("Gana JUGADOR 2");
			} else
				System.out.println("Gana JUGADOR 1");
		} while (!juego);
		// Cerramos el Scanner
		sc.close();

	}
}
