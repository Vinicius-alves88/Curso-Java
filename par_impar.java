import java.util.Locale;
import java.util.Scanner;

public class par_impar{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, x;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if (x == 0) {
				System.out.println("NULO");
			}
			else {
				if (x % 2 == 0) {
					System.out.print("PAR");
				}
				else {
					System.out.print("IMPAR");
				}
				if (x > 0) {
					System.out.print(" POSITIVO\n");
				}
				else {
					System.out.print(" NEGATIVO\n");
				}
			}
		}
		sc.close();
	}
}