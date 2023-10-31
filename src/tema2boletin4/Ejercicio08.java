package tema2boletin4;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Creamos las variables correspondientes
		String tirada1, tirada2;
		// Variables para almacenar el valor entero
		int valor1, valor2;
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		do {
			// Le pedimos al usuario que introduzca el valor de los dados en cadena
			System.out.println("Introduzca el valor del dado 1");
			tirada1 = sc.nextLine();

			switch (tirada1) {
			case "UNO" -> valor1 = 1;
			case "DOS" -> valor1 = 2;
			case "TRES" -> valor1 = 3;
			case "CUATRO" -> valor1 = 4;
			case "CINCO" -> valor1 = 5;
			case "SEIS" -> valor1 = 6;
			default -> System.out.println("Valor incorrecto. Pruebe de nuevo");
			}
			;
		} while (!(tirada1.equalsIgnoreCase("UNO") || tirada1.equalsIgnoreCase("DOS")
				|| tirada1.equalsIgnoreCase("TRES") || tirada1.equalsIgnoreCase("CUATRO")
				|| tirada1.equalsIgnoreCase("CINCO") || tirada1.equalsIgnoreCase("SEIS")));

		do {

			System.out.println("Introduzca el valor del dado 2");
			tirada2 = sc.nextLine();

			switch (tirada2) {
			case "UNO" -> valor2 = 1;
			case "DOS" -> valor2 = 2;
			case "TRES" -> valor2 = 3;
			case "CUATRO" -> valor2 = 4;
			case "CINCO" -> valor2 = 5;
			case "SEIS" -> valor2 = 6;
			default -> System.out.println("Valor incorrecto. Pruebe de nuevo");
			}
			;} while (!(tirada2.equalsIgnoreCase("UNO") || tirada2.equalsIgnoreCase("DOS")
					|| tirada2.equalsIgnoreCase("TRES") || tirada2.equalsIgnoreCase("CUATRO")
					|| tirada2.equalsIgnoreCase("CINCO") || tirada2.equalsIgnoreCase("SEIS")));
			if (valor1 == 0 || valor2 == 0) {
				System.out.println("Alguna de las tiradas es errónea");
			} else {
				System.out.println("La suma de las tiradas es: " + (tirada1 + tirada2));
			}
		
		// Cerramos el Scanner
		sc.close();

	}

}
