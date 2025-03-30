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
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("PRODUCT DATA: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
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

	//ATRIBUTOS
	public String name;
	public double price;
	public int quantity;
	
	//METODOS
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
		return name 
			+ ", " 
			+ String.format("%.2f", price) 
			+ ", " 
			+ quantity 
			+ " units, Total: $ " 
			+ String.format("%.2f", totalValueInStok());
	}
}
