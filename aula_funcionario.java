package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class aula_funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + funcionario.toString());
		
		System.out.print("\nWhich percentage to increase salary? ");
		funcionario.increaseSalary(sc.nextDouble());
		
		System.out.println("\nUpdated data: " + funcionario.toString());
		
		
		sc.close();
	}

}
