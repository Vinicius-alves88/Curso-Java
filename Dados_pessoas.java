package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas{
	 public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Quantas pessoas serão digitadas? ");
		 int n = sc.nextInt();
		 
		 double[] alturas = new double[n];
		 char[] generos = new char[n];
		 
		 for(int i = 0; i < n; i++) {
			 System.out.print("Altura da "+ (i+1) +"a pessoa: ");
			 alturas[i] = sc.nextDouble();
			 System.out.print("Genero da "+ (i+1) +"a pessoa (M/F): ");
			 generos[i] = sc.next().toUpperCase().charAt(0);
		 }
		 
		 double maiorAltura = alturas[0], menorAltura = alturas[0];
		 
		 for (int i = 0; i < n; i++) {
			 if (maiorAltura < alturas[i]){
				 maiorAltura = alturas[i];
			 }
			 
			 if (menorAltura > alturas[i]) {
				 menorAltura = alturas[i];
			 }
		 }
		 
		 System.out.println("Menor altura = "+ menorAltura);
		 System.out.println("Maior altura = "+ maiorAltura);
		 
		 double mediaAlturaMulheres = 0;
		 int cont = 0;
		 
		 for (int i = 0; i < n; i++) {
			 if (generos[i] =='F') {
				 mediaAlturaMulheres = mediaAlturaMulheres + alturas[i];
				 cont++;
			 }
		 }
		 
		 mediaAlturaMulheres = (double) mediaAlturaMulheres / cont;
		 System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaAlturaMulheres));
		 
		 cont = 0;
		 
		 for (int i = 0; i < n; i++) {
			 if (generos[i] == 'M') {
				 cont++;
			 }
		 }
		 
		 System.out.println("Numero de homens = "+ cont);

		 sc.close();
	 }
 }

