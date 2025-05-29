package application;

import java.util.Locale;
import java.util.Scanner;

import entites.OrderItem;
import entites.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product("TV", 1000.0);
		
		OrderItem oi1 = new  OrderItem(1, 1000.00, p);
		
		System.out.println(oi1.getProduct().getName());
		
		System.out.println(oi1);
		
		sc.close();
	}
}
