import java.util.Locale;
import java.util.Scanner;

public class glicose{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glicose;
		
		System.out.print("Digite a medida da glicose: ");
		glicose = sc.nextDouble();
		
		if (glicose > 140) {
			System.out.println("Classificacao: diabetes");
		}
		else if (glicose > 100 && glicose <= 140) {
			System.out.println("Classificacao: elevado");
		}
		else {
			System.out.println("Classificacao: normal");
		}
		
		
		sc.close();
	}
}