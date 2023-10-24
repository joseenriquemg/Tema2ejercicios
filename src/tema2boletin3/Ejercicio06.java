package tema2boletin3;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int edad =0;
		int edadAlumno = 0;
		int mayorEdad = 0;
		Scanner sc = new Scanner(System.in);
		
		while (edad >=0) {
			System.out.println("Introduzca su edad. Numero negativo para cerrar.");
			edad = sc.nextInt();
			edadAlumno++;
			if (edad >= 18) {
			mayorEdad++;
			System.out.println("MAYOR DE EDAD.");
			}else { 
			System.out.println("MENOR DE EDAD.");
			
			sc.close();
			
			
			}
		}
	}
}
			
			
			
			
			
			
			
			
		


