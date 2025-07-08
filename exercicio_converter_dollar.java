package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class exercicio_converter_dollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter conversor = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		conversor.dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		conversor.amount = sc.nextDouble();
		
		System.out.println(conversor.toString());
		
		
		sc.close();
	}

}
