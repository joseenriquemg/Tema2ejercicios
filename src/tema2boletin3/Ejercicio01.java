package tema2boletin3;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creamos las variables
		int suma = 0;
		int numero;
		// Abrimos el Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número. Valor negativo para salir");
		numero = sc.nextInt();
		// Mientras el numero sea positivo e seguira ejecutando
		while (numero >= 0) {
			suma += numero;// suma =suma + numero
			// Pedimos un numero al usuario
			System.out.println("Introduzca un número. Valor negativo para salir");
			numero = sc.nextInt();
		}
		// Imprimimos el resultado de la suma
		System.out.println("Suma total: " + suma);
		// Cerramos el Scanner
		sc.close();

	}

}
