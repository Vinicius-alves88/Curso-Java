import java.util.Locale;
import java.util.Scanner;

public class soma_vetor{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i;
		
		System.out.print("Quantos numeros vc vai digitar? ");
		N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		double soma, media;
		int cont;
		cont = 0;
		soma = 0;
		System.out.print("VALORES = ");
		
		for (i = 0; i < N; i++) {
			System.out.print(String.format("%.1f", vet[i]) + " ");
			soma = soma + vet[i];
			cont++;
		}
		
		media = (double) soma / cont;
		System.out.println("\nSOMA = " + String.format("%.2f", soma));
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}
}