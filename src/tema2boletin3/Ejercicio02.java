package tema2boletin3;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos las variables
		int contador = 0;
		int numero;
		// Abrimos el Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número. Valor negativo para salir");
		numero = sc.nextInt();
		// Mientras el numero sea positivo se seguira ejecutando
		while (numero >= 0) {
			contador++;// contador + 1
		// Pedimos un numero al usuario
		System.out.println("Introduzca un número. Valor negativo para salir");
		numero = sc.nextInt();
		}
		// Imprimimos el resultado de la suma
		System.out.println("Suma total: " + contador);
		// Cerramos el Scanner
		sc.close();

	}

}
