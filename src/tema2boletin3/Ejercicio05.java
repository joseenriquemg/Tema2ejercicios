package tema2boletin3;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creamos las variables
		int numero;
		int ceros = 0;
		int sumaNegativos = 0;
		double negativos = 0;
		int contador = 1;
		int positivos = 0;
		
		// Abrimos el Scanner
		Scanner sc = new Scanner(System.in);
		// Mientras el numero sea positivo e seguira ejecutando
		while (contador <= 10) {
			System.out.println("Introduzca un número:");
			numero = sc.nextInt();

			if (numero > 0) {
				positivos += numero;
				
			} else if (numero < 0) {
				sumaNegativos += numero;
				negativos++;
			} else {
				ceros++;
			}
			contador++;
			

		}
		if (negativos != 0)
			sumaNegativos /=  negativos;
		// Imprimimos el resultado
		System.out.println("Ha introducido " + ceros + " ceros.");
		System.out.println("La media de los negativos es: " + sumaNegativos);
		System.out.println("La suma de los numero positivos es: " + positivos );

		// Cerramos el Scanner
		sc.close();

	}

}
