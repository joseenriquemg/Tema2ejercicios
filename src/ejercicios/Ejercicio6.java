package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	    
		int a , b , c; 
		double x1, x2;
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
		if (discriminante < 0) {
	    System.out.println("La ecucion no tiene solucion real. ");
	    } else {
	    if ( a == 0 ) {
	    x1 = -c / b;
	    System.out.println("La ecuacion tiene una unica solucion: " + x1);
	    } else {
	    x1 = (double) ((-b + Math.sqrt(discriminante)) / 2 * a);
	    x2 = (double) ((-b - Math.sqrt(discriminante)) / 2 * a);
	    System.out.println("Las soluciones de la ecucion son: \n1" + x1 + "\n" + x2);}}
        //Cerramos el Scanner
		sc.close();


 
 }}
	


