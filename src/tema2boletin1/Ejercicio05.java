package tema2boletin1;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creamos las variables
		double num1;
		double num2;
		double num3;
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Solicitamos al usuario tres numeros
		System.out.println("Introduzca un numero: ");
		// Leemos el numero del teclado
		num1 = sc.nextDouble();
		System.out.println("Introduzca un numero: ");
		// Leemos el numero del teclado
		num2 = sc.nextDouble();
		System.out.println("Introduzca un numero: ");
		// Leemos el numero del teclado
		num3 = sc.nextDouble();
		// Aplicamos las operaciones
		if (num1 >= num2 && num2 >= num3) {
			System.out.println("Sus numero ordenados son asi: " + num1 + ", " + num2 + " y " + num3);
		} else if (num1 >= num3 && num3 >= num2) {
			System.out.println("Sus numero ordenados son asi: " + num1 + ", " + num3 + " y " + num2);
		} else if (num2 >= num3 && num3 >= num1) {
			System.out.println("Sus numero ordenados son asi: " + num2 + ", " + num3 + " y " + num1);
		} else if (num2 >= num1 && num1 >= num3) {
			System.out.println("Sus numero ordenados son asi: " + num2 + ", " + num1 + " y " + num3);
		} else if (num3 >= num1 && num1 >= num2) {
			System.out.println("Sus numero ordenados son asi: " + num3 + ", " + num1 + " y " + num2);
		} else if (num3 >= num2 && num2 >= num1) {
			System.out.println("Sus numero ordenados son asi: " + num3 + ", " + num2 + " y " + num1);
		} 
		//Cerramos el Scanner
		sc.close();
	
	}
}
