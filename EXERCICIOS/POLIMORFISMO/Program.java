package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		System.out.print("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.println((i + 1) + "º PRODUTO:");
			System.out.print("Comum, Usado ou Importado (c/u/i):");
			char res = sc.next().charAt(0);
			System.out.print("NOME: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("PRECO: ");
			double preco = sc.nextDouble();
			if(res == 'c') {
				Produto prduto = new Produto(nome, preco);
				listaProdutos.add(prduto);
			}else if(res == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				String data = sc.next();
				ProdutoUsado prod_usado = new ProdutoUsado(nome, preco, sdf.parse(data));
				listaProdutos.add(prod_usado);
			}else {
				System.out.print("Taxa de alfandega: ");
				Double taxaAlfandega = sc.nextDouble();
				ProdutoImportado prod_importado = new ProdutoImportado(nome, preco, taxaAlfandega);
				listaProdutos.add(prod_importado);
			}
		}
		
		System.out.println();
		System.out.println("TAGS DE PREÇOS:");
		
		for(Produto p : listaProdutos) {
			System.out.println(p.etiquetaDePreco());
		}
		
		sc.close();
	}
}
