import java.util.Locale;
import java.util.Scanner;

public class media_idades{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, soma, cont;
		double media;
		
		System.out.println("Digite as idades:");
		idade = sc.nextInt();
		
		soma = 0;
		cont = 0;
		
		if (idade <= 0) {
			System.out.println("Impossivel calcular!");
		}
		else {
			while (idade > 0) {
				cont = cont + 1;
				soma = soma + idade;
				idade = sc.nextInt();
			}
			
			media = (double) soma / cont;
			System.out.println("MEDIA = " + String.format("%.2f", media));
			
		}
		
		sc.close();
	}
}