package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos las variables
		int num1;
		int num2;
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Solicitamos al usuario dos numeros
		System.out.println("Introduzca un numero: ");
		//Leemos el numero del teclado
		num1 = sc.nextInt();
		System.out.println("Introduzca un numero: ");
		//Leemos el numero del teclado
		num2 = sc.nextInt();
		//Aplicamos nuestras operaciones
		if (num1>num2) {
		System.out.println("El " + num1 + " es mayor que el " + num2);
		}else { 
		System.out.println("El " + num1 + " es menor o igual que el " + num2);
		//Cerramos el Scanner
		}sc.close();
		
		
		

	}

}
