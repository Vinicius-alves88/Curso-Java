package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class aula_aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		System.out.print("NOME: ");
		aluno.name = sc.nextLine();
		
		System.out.println("NOTAS:");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(aluno.toString());
		
		
		sc.close();
	}

}
