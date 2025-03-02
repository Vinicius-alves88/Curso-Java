import java.util.Locale;
import java.util.Scanner;

public class pagamento{
	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double valorHora, pagamento;
		int horaTrabalhadas;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		horaTrabalhadas = sc.nextInt();
		
		pagamento = valorHora * horaTrabalhadas;
		
		System.out.println("O pagamento para " + nome + " deve ser " + String.format("%.2f", pagamento));
		
		sc.close();
	}
}