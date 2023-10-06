package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	    
		int a , b , c;
		long discriminante;
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Solicitamos al usuario tres numeros
		System.out.println("Introduzca un valor para a: ");
		// Leemos el valor del teclado
		a = (int) sc.nextDouble();
		System.out.println("Introduzca un valor para b: ");
		// Leemos el valor del teclado
		b = (int) sc.nextDouble();
		System.out.println("Introduzca un valor para c: ");
		// Leemos el valor del teclado
		c = (int) sc.nextDouble();
		//Añadimos las operaciones matemáticas
		discriminante = (long) (Math.pow (b, 2) - (4 * a * c));
		//
		if (discriminante < 0);
	    System.out.println("La ecucion no tiene solucion real. ");
 


 
 }}
	


