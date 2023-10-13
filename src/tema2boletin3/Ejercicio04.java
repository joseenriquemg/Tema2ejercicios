package tema2boletin3;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos las variables
        int numero;
		// Abrimos el Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número. Añade 0 para cerrar");
		numero = sc.nextInt();
		// Mientras el numero no sea cero, se seguira ejecutando
		while (numero != 0) {
			if (numero % 2 == 0) {
				System.out.println("Su numero es par.");
			} else {
				System.out.println("Su numero es impar.");
			}
			// Pedimos un numero al usuario
			System.out.println("Introduzca un número. Añade 0 para cerrar");
			numero = sc.nextInt();
		}
		System.out.println("Cerrando el Scanner");
		// Cerramos el Scanner
		sc.close();

	}

}
