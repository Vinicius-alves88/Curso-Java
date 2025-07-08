package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_vect;

public class Aula2_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o tamanho do vetor? ");
		int n = sc.nextInt();
		Product_vect[] vect = new Product_vect[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product_vect(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f", avg);
		sc.close();

	}

}
