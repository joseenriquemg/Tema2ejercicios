package tema2boletin4;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Creamos las variables
		int num ;
		int cont = 0;
		int multiplicacion = 0;
		//Abrimos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		//Creamos nuestros do-while
		do {
			System.out.println("Elige el número del que deseas saber su tabla de multiplicar");
			num = sc.nextInt();
		
		} while (num < 0 );
		
		do {
			multiplicacion = num * cont;
			
			System.out.println(+ num + " x " + cont + " = " + multiplicacion);
			cont++;
		} while (cont <= 10);
		//Cerramos el Scanner
		sc.close();
	}

}
