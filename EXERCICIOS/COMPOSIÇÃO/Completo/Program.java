package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Product;
import entites.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("DADOS DO CLIENTE");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de aniverssario (DD/MM/AAAA): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("DADOS DO PEDIDO");
		System.out.print("Status do pedido: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order  = new Order(new Date(), status, client);
		
		System.out.print("Quantos itens o pedido vai ter: ");
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.println("Pedio " + i + ":");
			System.out.print("Nome Produto: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Preco Produto: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantidade Produto: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);
	
		sc.close();
	}
}