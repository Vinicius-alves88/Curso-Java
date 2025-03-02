package orientacao_objetos;
import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class metodo_retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a largura e altura do retangulo:");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", retangulo.area()));
		System.out.println("PERIMETRO = " + String.format("%.2f", retangulo.perimetro()));
		System.out.println("DIAGONAL = " + String.format("%.2f", retangulo.diagonal()));
		sc.close();
	}

}
