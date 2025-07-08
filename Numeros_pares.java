package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] numerosInt = new int[n];
		
		for (int i = 0; i < numerosInt.length; i++) {
			System.out.print("Digite um numero: ");
			numerosInt[i] = sc.nextInt();
		}

		System.out.println("NUMEROS PARES:");
		int cont = 0;

		for (int i = 0; i < numerosInt.length; i++) {
			if (numerosInt[i] %2==0) {
				System.out.print(numerosInt[i] + " ");
				cont ++;
			}
		}
		
		System.out.println("\nQUANTIDADE DE PARES = " + cont);
		sc.close();
	}

}
