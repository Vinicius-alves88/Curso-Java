import java.util.Locale;
import java.util.Scanner;

public class bhaskara{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.print("Digite o coeficiente A: ");
		a = sc.nextDouble();
		System.out.print("Digite o coeficiente B: ");
		b = sc.nextDouble();
		System.out.print("Digite o coeficiente C: ");
		c = sc.nextDouble();
		
		delta = (b * b) - (4 * a * c);
		
		if (a == 0 || delta <= 0) {
			System.out.println("Essa equação nao possui raizes reais! ou nao e possivel fazer divisao por 0");
		}
		else {
	        x1 = (-b + Math.sqrt(delta)) / (2 * a);
	        x2 = (-b - Math.sqrt(delta)) / (2 * a);
	        System.out.println("X1 = " + String.format("%.4f", x1));
	        System.out.println("X2 = " + String.format("%.4f", x2));
	    }
					
		sc.close();
	}
}