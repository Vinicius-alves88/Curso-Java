import java.util.Locale;
import java.util.Scanner;

public class notas{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3.0;
		
		if (media >= 7.0) {
			System.out.println("O aluno foi aprovado!\nMEDIA = " + String.format("%.1f", media));
			
		}
		else {
			System.out.println("O aluno foi reprovado!\nMEDIA = " + String.format("%.1f", media));
		}
		
		
		sc.close();
	}
}