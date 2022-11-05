package ejercicios;

import java.util.Scanner;

// Solución del Ejercicio 7 usando bucles infinitos
public class Ejercicio7 {

	public static void main(String[] args) {
		// Creo una variable donde se guardará el número a adivinar
		int numeroOrdenador = (int) (Math.random()*100+1);
		
		// Variable donde almacenaré el número introducido por el usuario
		int numero;
		
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creo un bucle infinito
		// Saldré de él cuando acierte el número
		while(true) {
			// Le pedimos al usuario un número
			System.out.println("Introduzca un número: ");
			numero = sc.nextInt();
			if(numero == numeroOrdenador) { 
				System.out.println("¡¡HAS ACERTADO!!");
				break; // Si hemos acertado nos salimos del bucle
			} else if (numero > numeroOrdenador) {
				System.out.println("El número que has introducido es mayor");
			} else
				System.out.println("El número que has introducido es menor");
		}
		
		sc.close();
	}

}
