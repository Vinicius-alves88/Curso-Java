import java.util.Locale;
import java.util.Scanner;

public class estrutura_do_while{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double celcius, fahrenheit;
		char repetir;
		
		do {
			System.out.print("Digite a temperatura em celcius: ");
			celcius = sc.nextDouble();
			fahrenheit = (9.0 * celcius) / 5.0 + 32.0;
			System.out.printf("Equivalente em celcius: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n): ");
			repetir = sc.next().charAt(0);
			
		} while (repetir != 'n');

		System.out.println("Fim do Programa!");
		sc.close();
	}
}