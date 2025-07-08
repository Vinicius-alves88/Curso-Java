package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc vai digitar? ");
		int n = sc.nextInt();
		int i;
		
		double[] vet = new double[n];
		for (i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.print("\nVALORES =");
		double soma = 0;
		for (i = 0; i < vet.length; i++) {
			System.out.printf(" %.1f ",vet[i]);
			soma += vet[i];
		}
		
		System.out.printf("\nSOMA = %.2f", soma);
		double media = soma / n;
		System.out.printf("\nMEDIA = %.2f", media);
		
		sc.close();
	}

}
