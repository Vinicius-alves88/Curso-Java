package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	//Valor dos produtos em estoque
	public double totalValueInStock() {
		return price * quantity;
	}
	
	/*adicionar produtos na variavel quantity usando "this" 
	*somando o quantity argumento com o quantity da classe
	*/ 
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	//o mesmo principio da funcao acima so que remove produtos
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
