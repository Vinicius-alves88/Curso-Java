import java.util.Scanner;
import java.util.Locale;

public class vetor{
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
		
		System.out.println("\nNUMEROS DIGITADOS:");
		
		for (i = 0; i < N; i++) {
			System.out.println(String.format("%.1f" ,vet[i]));
		}
		
		
		sc.close();
	}
}