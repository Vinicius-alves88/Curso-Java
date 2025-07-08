package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		int contPares = 0;
		
		double media = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] %2 == 0) {
				contPares ++;
				media += vetor[i];
			}
		}
		media = media / contPares;
		
		if (contPares > 0) {
			System.out.println("MEDIA DOS PARES: " + String.format("%.1f", media));
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		
		
		sc.close();
	}

}
