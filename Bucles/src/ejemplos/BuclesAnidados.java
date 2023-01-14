package ejemplos;

import java.util.Scanner;

public class BuclesAnidados {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño del triángulo:");
		
		numero= sc.nextInt();
		
		for(int i = 1;i<=numero;i++) {
			for(int j=i; j<=numero; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
