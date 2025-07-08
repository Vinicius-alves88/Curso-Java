package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc vai digitar? ");
		int n = sc.nextInt();
		
		double[] numerosDouble = new double[n];
		Vetor vet = new Vetor(n);
		
		for (int i = 0; i < numerosDouble.length; i++) {
			System.out.print("Digite um numero: ");
			numerosDouble[i] = sc.nextDouble();
		}
		
		vet.setNumerosDouble(numerosDouble);
		
		System.out.println("\nMAIOR VALOR = " + String.format("%.1f", vet.maiorValor()));
		System.out.println("POSICAO DO MAIOR VALOR = " + vet.posicaoMaiorValor());
		
		sc.close();
	}

}
