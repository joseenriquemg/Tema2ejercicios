package tema2boletin1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Creamos nuestras variables
		int num;
		//Abrimos el Scanner
		Scanner sc = new Scanner(System.in);
		//Solicitamos un numero al usuario
		System.out.println("Introduzca un numero: ");
		//Leemos el numero del teclado
		num = sc.nextInt();
		//Preparanos las operaciones
		if (num %2==0) {
		System.out.println("Su numero es par");
		}else {
		System.out.println("Su numero es impar");}
		//Cerramos el Scanner
		sc.close();
		  }
				

	}


