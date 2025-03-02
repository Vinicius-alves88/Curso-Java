import java.util.Locale;
import java.util.Scanner;

public class area_do_triangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/* Resolvendo um problema sem orientacao a objetos */
		
		System.out.println("Enter the measures of triangle X:");
		double xA = sc.nextDouble();
		double xB = sc.nextDouble();
		double xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		double yA = sc.nextDouble();
		double yB = sc.nextDouble();
		double yC = sc.nextDouble();
		
		double pX = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		double pY = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
}