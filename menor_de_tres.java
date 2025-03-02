import java.util.Locale;
import java.util.Scanner;

public class menor_de_tres{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, valor3, menor;
		
		System.out.print("Primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		valor2 = sc.nextInt();
		System.out.print("Terceiro valor: ");
		valor3 = sc.nextInt();
		
		if (valor1 < valor2 && valor1 < valor3) {
			menor = valor1;
		}
		else if (valor2 < valor3) {
			menor = valor2;
		}
		else {
			menor = valor3;
		}
		
		System.out.println("MENOR = " + menor);
		sc.close();
	}
}