package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// En suma guardaré el resultado de sumar todos los números introducidos por el
				// usuario
				int contador = 0;

				// num es el valor introducido por el usuario por teclado
				int num = 0;

				// Creo el Scanner
				Scanner sc = new Scanner(System.in);

				// Le pido al usuario que introduzca un número:
				System.out.println(
						"Introduzca un número entero positivo. Introduzca un valor negativo para salir del programa. ");
				num = sc.nextInt();

				// Mientras el usuario me siga introduciendo valores positivos los iré sumando
				// Saldré del bucle cuando el usuario introduzca un valor negativo
				while (num >= 0) {
					// Le añado a la variable el valor de num
					contador++;

					// Le vuelvo a pedir al usuario un número
					num = sc.nextInt();
				}
				// Imprimo el resultado de la suma
				System.out.println("Ha introducido: " + contador + " números.");
				
				sc.close();
	}

}
