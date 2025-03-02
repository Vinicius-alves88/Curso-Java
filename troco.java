import java.util.Locale;
import java.util.Scanner;

public class troco{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoUni, dinRecebido, troco;
		int qntComprada;
		
		System.out.print("Preco unitario do produto: ");
		precoUni = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qntComprada = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinRecebido = sc.nextDouble();
		
		troco = dinRecebido - (precoUni * qntComprada);
		
		System.out.println("TROCO = " + String.format("%.2f", troco));
		
		
		sc.close();
	}
}