package tema2boletin4;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Creamos las variables
		double num1, num2;
		// Variable donde guardar el resultado
		double resultado;
		// Abrimos cadena para guardar las opciones
		String opcion;
		// Cereramos el Scanner
		Scanner sc = new Scanner(System.in);

		do {
			// Le pedimos al usuario los dos números
			System.out.println("Introduzca dos números");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();

			// Imprimimos el menú
			System.out.println("Seleccione una opción");
			System.out.println("A. SUMAR");
			System.out.println("B. RESTAR");
			System.out.println("C. MULTIPLICAR");
			System.out.println("D. DIVIDIR");
			System.out.println("E. SALIR");

			// Leemos la opción seleccionada
			opcion = sc.next();
			switch (opcion) {
			case "A" -> {
				resultado = num1 + num2;
				System.out.println("La suma es " + resultado);
			}
			case "B" -> {
				resultado = num1 - num2;
				System.out.println("La resta es " + resultado);
			}
			case "C" -> {
				resultado = num1 * num2;
				System.out.println("La multiplicación es " + resultado);
			}
			case "D" -> {
				if (num2 != 0) {
					resultado = num1 / num2;
					System.out.println("La división es " + resultado);
				} else {
					System.out.println("No se puede dividir por 0");
				}
			}
			case "E" -> {
				System.out.println("HAS SALIDO DEL SISTEMA");
			}

			default -> System.out.println("La opción seleccionada no es válida");
			}
		} while (!opcion.equalsIgnoreCase("E"));

		// Cierre del Scanner
		sc.close();
	}

}
