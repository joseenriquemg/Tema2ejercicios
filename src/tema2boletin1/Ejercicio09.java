package tema2boletin1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//Ponemos nuestras variables
		final int Piedra = 1;
		final int Papel = 2;
		final int Tijeras = 3;
		int jugador1, jugador2;
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Pedimos a los dos jugadores su eleccion y leemos del teclado
		System.out.println("Elija entre: Piedra = 1, Tijeras = 2 y Papel = 3");
		System.out.println();
		System.out.println("Elija JUGADOR 1: ");
		jugador1 = sc.nextInt();
		System.out.println("Elija JUGADOR 2: ");
		jugador2 = sc.nextInt();
		//Añadimos el resultado
		if (jugador1 == jugador2) {
			System.out.println("EMPATE");
		}else if (jugador1 ==1 && jugador2==2 || jugador1==2 && jugador2==1 || jugador1==3 && jugador2==2) {
        System.out.println("Gana JUGADOR 2");
		}else
        System.out.println("Gana JUGADOR 1");
		//Cerramos el Scanner
		sc.close();
		

	}

}
