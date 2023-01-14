package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// En contador guardaré la cantidad de números introducidos por el
		// usuario
		int contador = 0;

		// num es el valor introducido por el usuario por teclado
		int num = 0;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario que introduzca un número:
		System.out.println(
				"Introduzca un número entero positivo. "
				+ "Introduzca un valor negativo para salir del programa. ");
		num = sc.nextInt();
		while (num >= 0) {
			// Incremento en 1 el contador
			contador++;

			// Le vuelvo a pedir al usuario un número
			System.out.println(
					"Introduzca un número entero positivo. "
					+ "Introduzca un valor negativo para salir del programa. ");
			num = sc.nextInt();
		}
		// Imprimo el resultado de la suma
		System.out.println("Ha introducido: " + contador + " números.");

		sc.close();
	}

}
