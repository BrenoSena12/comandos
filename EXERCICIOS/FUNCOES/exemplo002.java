/**
LER DADOS DE UM PRODUTO EM ESTOQUE - NOME, PRECO, QUANTIDADE ESTOQUE
MOSTRAR DADOS DO PRODUTO - NOME, PRECO, QUANTIDADE ESTOQUE, VOLOR TOTAL ESTOQUE
REALIZAR ENTRADA E MOSTRAR DADOS
REALIZAR SAIDA E MOSTRAR DADOS
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		product.setName("Computer");
		System.out.println("Update name: " + product.getName());

		product.setPrice(888.88);
		System.out.println("Update price: " + product.getPrice());

		System.out.println();
		System.out.println("PRODUCT DATA: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("UPDATED DATA: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("UPDATED DATA: " + product);

		sc.close();

	}
}


//--------------------------------------------------------------------

package entities;

public class Product {

	// ATRIBUTOS
	private String name;
	private double price;
	private int quantity;

	//CONSTRUTORES
	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//GET E SET
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// METODOS
	public double totalValueInStok() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStok());
	}
}
