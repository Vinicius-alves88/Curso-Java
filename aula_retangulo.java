package exercicios;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class aula_retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", retangulo.area()));
		System.out.println("PERIMETER = " + String.format("%.2f", retangulo.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", retangulo.diagonal()));
		
		sc.close();
	}

}
