package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		float nota;
		 Scanner sc = new Scanner(System.in); {
			System.out.print("Ingrese nota de Examen: ");
			nota = sc.nextFloat();
		}
		if (nota < 5) {
			System.out.println("\nInsuficiente");
		}
		if (nota >= 5 && nota <= 6 ) {
			System.out.println("\nSuficiente");
		}
		if (nota >= 6 && nota <= 7 ) {
			System.out.println("\nBien");
		}
		if (nota >= 7 && nota < 9 ) {
			System.out.println("\nNotable");
		}
		if (nota >= 9 && nota <= 10 ) {
			System.out.println("\nSobresaliente");
		//Cerramos el Scanner
		sc.close();
		}
		}
	}

	


