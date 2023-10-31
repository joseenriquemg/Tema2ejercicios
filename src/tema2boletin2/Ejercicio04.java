package tema2boletin2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos las variables correspondientes
		String dado1, dado2;
		// Variables para almacenar el valor entero
		int valor1, valor2;
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que introduzca el valor de los dados en cadena
		System.out.println("Introduzca el valor del dado 1");
		dado1 = sc.next();
		// Le pedimos al usuario que introduzca el valor de los dados en cadena
		System.out.println("Introduzca el valor del dado 2");
		dado2 = sc.next();
		valor1 = switch (dado1) {
		case "UNO" -> 1;
		case "DOS" -> 2;
		case "TRES" -> 3;
		case "CUATRO" -> 4;
		case "CINCO" -> 5;
		case "SEIS" -> 6;
		default -> 0;
		};
		valor2 = switch (dado2) {
		case "UNO" -> 1;
		case "DOS" -> 2;
		case "TRES" -> 3;
		case "CUATRO" -> 4;
		case "CINCO" -> 5;
		case "SEIS" -> 6;
		default -> 0;
		};
		if (valor1 == 0 || valor2 == 0) {
			System.out.println("Alguna de las tiradas es errónea");
		} else {
			System.out.println("La suma de las tiradas es: " + (valor1 + valor2));
		}
		// Cerramos el Scanner
		sc.close();

	}

}
