package entities;

public class funcionario {

	public String name;
	public double grossSalary;
	public double tax;
	
	//salário liquido
	public double netSalary() {
		double netSalary = this.grossSalary - this.tax;
		return netSalary;
	}

	// Aumenta o salario do funcionario com base em uma porcentagem dada
	public void increaseSalary(double percentage) {
		this.grossSalary += (percentage / 100) * this.grossSalary;
	}
	
	
}
