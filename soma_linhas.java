import java.util.Locale;
import java.util.Scanner;

public class soma_linhas{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m, n, i ,j;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		n = sc.nextInt();
		
		double[][] mat = new double[m][n];
		
		for (i = 0; i < m; i++) {
			System.out.println("Digite os elementos da "+ (i+1) +"a. linha:" );
			for (j = 0; j  < n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double[] vet = new double[m];
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				vet[i] = vet[i] + mat[i][j];
			}
		}
		
		System.out.println("VETOR GERADO:");
		for (i = 0; i < m;i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}
		
		sc.close();
	}
}