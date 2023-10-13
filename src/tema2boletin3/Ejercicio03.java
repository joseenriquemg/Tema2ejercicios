package tema2boletin3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creamos las variables
		float media = 0;
		float numero;
		int contador = 0;
		// Abrimos el Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número. Valor negativo para salir");
		numero = sc.nextFloat();
		// Mientras el numero sea positivo e seguira ejecutando
		while (numero >= 0) {
			// Para contar los numeros añadidos
			contador++; // Contador + 1
			// Para sumar los numeros añadidos
			media += numero; // Media + numero
			// Pedimos un numero al usuario
			System.out.println("Introduzca un número. Valor negativo para salir");
			numero = sc.nextFloat();
		}
		// Imprimimos el resultado de la suma
		System.out.println("La media es: " + media / contador);
		// Cerramos el Scanner
		sc.close();

	}

}
