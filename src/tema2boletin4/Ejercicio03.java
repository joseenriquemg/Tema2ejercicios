package tema2boletin4;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creamos las variables
		int num ;
		int cont = 1;
		int suma = 0;
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		//Creamos un DO - WHILE
		do {
			System.out.println("Introduzca un numero mayor que 0 para sumarle sus anteriores");
			num = sc.nextInt();
		} while (num < 1 );
		
		do {
			suma += cont ;
			cont++;
			
		}while (cont <= num);
		System.out.println("La suma de los números comprendidos ente 1 y " + num + " es " + suma);
		
		//Cerramos el Scanner
		sc.close();
}
}
