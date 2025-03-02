import java.util.Locale;
import java.util.Scanner;

public class alturas{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i;
		double alturaMedia, menor16;
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		N = sc.nextInt();
		
		String[] nome = new String[N];
		double[] altura = new double[N];
		int[] idade = new int[N];
		
		for (i = 0; i < N; i++) {
			System.out.println("Dados da " + (i+1) +"a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		menor16 = 0;
		alturaMedia = 0;
		for (i = 0; i < N; i++) {
			alturaMedia = alturaMedia + altura[i];
			if (idade[i] < 16) {
				menor16++;
			}
		}
		
		alturaMedia = (double) alturaMedia / N;
		System.out.println("Altura media: "+ String.format("%.2f", alturaMedia));
		
		double porcentagem;
		porcentagem = (double) (menor16 * 100.0) / N;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagem) + "%");
		
		for (i = 0; i < N; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		
		
		sc.close();
	}
}