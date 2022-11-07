package ejemplos;

public class EjemploBreak {

	public static void main(String[] args) {
		int i=1;
		while (i<=10) {
			System.out.println("La i vale: " + i);
			if(i==2) {
				break;
			}
			i++;
		}

	}

}
