import java.util.Locale;
import java.util.Scanner;

public class temperatura{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double celsius, fahrenheit;
		char escala;
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		escala = sc.next().charAt(0);
		
		if (escala == 'C') {
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();
			fahrenheit = (celsius * 9 / 5) + 32;
			System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", fahrenheit));
		}
		else if (escala == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			fahrenheit = sc.nextDouble();
			celsius = (fahrenheit - 32) * 5 / 9;
			System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", celsius));
		}
		
		sc.close();
	}
}