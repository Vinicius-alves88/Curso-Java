package orientacao_objetos;

import java.util.Locale;
import java.util.Scanner;
import entities.funcionario;

public class metodo_funcionario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		funcionario funcionario = new funcionario();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salaty: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + funcionario.name + ", $ " + String.format("%.2f", funcionario.netSalary()));

		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		funcionario.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: " + funcionario.name + ", $ " + String.format("%.2f", funcionario.netSalary()));
		
		sc.close();
	}

}
