package entities;

public class Retangulo{
	
	public double largura;
	public double altura;
	
	// Calculo da area do retangulo
	public double area() {
		double area = largura * altura;
		return area;
	}
	
	// Calculo do perimetro do retangulo
	public double perimetro() {
		double perimetro = 2.0 * (largura + altura);
		return perimetro;
	}
	
	// Calculo da diagonal do retangulo
	public double diagonal() {
		double diagonal = Math.sqrt((Math.pow(altura, 2.0) + Math.pow(largura, 2.0)));
		return diagonal;	
	}
	
}