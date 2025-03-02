import java.util.Locale;
import java.util.Scanner;

public class experiencias{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char cobaia;
		int N , i, qntCobaias, qntRato, qntSapo, qntCoelho, total;
		double perSapos, perCoelhos, perRatos;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		N = sc.nextInt();
		
		qntRato = 0;
		qntSapo = 0;
		qntCoelho = 0;
		
		for (i = 0; i < N; i++) {
			System.out.print("Quantidade de cobaias: ");
			qntCobaias = sc.nextInt();
			System.out.print("Tipo de cobaia (R/S/C): ");
			cobaia = sc.next().charAt(0);
			
			if (cobaia == 'R') {
				qntRato = qntRato + qntCobaias;
			}
			else if (cobaia == 'S') {
				qntSapo = qntSapo + qntCobaias;
			}
			else if (cobaia == 'C') {
				qntCoelho = qntCoelho + qntCobaias;
			}
			else {
				System.out.println("INVALIDO!");
			}
		}
		
		total = qntRato + qntSapo + qntCoelho;
		
		perCoelhos = (double) (qntCoelho * 100) / total;
		perSapos = (double) (qntSapo * 100) / total;
		perRatos = (double) (qntRato * 100) / total;
		
		
		System.out.println("RELATORIO FINAL:");
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + qntCoelho);
		System.out.println("Total de ratos: " + qntRato);
		System.out.println("Total de sapos: " + qntSapo);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", perCoelhos));
		System.out.println("Percentual de ratos: " + String.format("%.2f", perRatos));
		System.out.println("Percentual de sapos: " + String.format("%.2f", perSapos));
		
		
		sc.close();
	}
}