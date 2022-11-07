package ejercicios;

import java.util.Scanner;

public class EjemploFor {

	public static void main(String[] args) {
		int num;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for (int indice = 2; indice <= num; indice=indice+2) {
			contador++;
		}

		for (int i=1, j=0; i< num && j>0; i++, j=j+2) {
			
		}
		System.out.println("Hay " + contador + " números pares");
	}

}
