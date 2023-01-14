package ejemplos;

public class EjemploContinue {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			i++;
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("La i vale: " + i);
		}
	}
}
