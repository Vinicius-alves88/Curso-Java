package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Desafio_pencionato {

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\nRent #"+ i + ":");
			
			System.out.print("Name: ");
			sc.nextLine();
			String names = sc.nextLine();
			
			System.out.print("Email: ");
			String emails = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(names, emails);
		}
		
		System.out.println("\nBusy rooms:");
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();
	}

}
