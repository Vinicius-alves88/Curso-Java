package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entities.Vetor;

public class Alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha após o número

        Vetor vet = new Vetor(n);

        // Arrays auxiliares para leitura e preenchimento da classe
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        // Leitura dos dados
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha
        }

        // Enviando os dados para o objeto Vetor
        vet.setName(nomes);
        vet.setIdade(idades);
        vet.setAltura(alturas);

        // Exibindo resultados
        System.out.printf("%nAltura média: %.2f%n", vet.alturaMedia());

        double percentual = vet.percentualMenoresDe16();
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentual);

        // Exibindo nomes das pessoas com menos de 16 anos
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
