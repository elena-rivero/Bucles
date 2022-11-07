package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int contador = 1;
		int sumaPositivos = 0; // Guardará la suma de los positivos
		int sumaNegativos = 0; // Esta suma me servirá para la media
		int cuentaNegativos = 0; // Necesito saber cuántos números negativos se han introducido para hacer la media
		int cuentaCeros = 0; // Contará la cantidad de ceros introducida

		// num es el valor introducido por el usuario por teclado
		int num = 0;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		while (contador <= 10) {
			// Le pedimos un número al usuario
			System.out.println("Introduzca un número entero. ");
			num = sc.nextInt();
			
			if(num>0) {
				// Si el número es positivo lo añadimos a la suma
				sumaPositivos+=num;
			}else if (num<0) {
				// Si el número es negativo, añadimos a la suma el negativo y también tenemos que contar
				// cuántos números negativos se han introducido para hacer la media.
				sumaNegativos+=num;	
				cuentaNegativos++;
			}else {
				// Añadimos uno a la cuenta de ceros.
				cuentaCeros++;
			}
			// Incrementamos en 1 el contador
			contador++;

		}
		// Imprimo los distintos resultados
		System.out.println("La suma de los números positivos es: " + sumaPositivos);
		double mediaNegativos = ((double) sumaNegativos/ (double) cuentaNegativos);
		System.out.println("La media de los números negativos es: " + mediaNegativos);
		System.out.println("El número de ceros introducidos es: " + cuentaCeros);
		
		sc.close();

	}

}
