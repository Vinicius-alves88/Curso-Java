import java.util.Locale;
import java.util.Scanner;

public class operadora{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double planoBasico, excedente, valor;
		int qntMinutos;
		
		System.out.print("Digite a quantidade de minutos: ");
		qntMinutos = sc.nextInt();
		
		planoBasico = 50.00;
		excedente = 2.00;
		
		if (qntMinutos > 100) {
			valor = (qntMinutos - 100) * excedente + planoBasico;
		}
		else {
			valor = planoBasico;
		}
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", valor));
		
		sc.close();
	}
}