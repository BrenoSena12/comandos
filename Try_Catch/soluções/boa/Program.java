package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reserva;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Numero do quarto: ");
			int numeroQuarto = sc.nextInt();
			System.out.print("Data de entrada (DD/MM/AAAA): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Data de saida (DD/MM/AAAA): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			System.out.println("Entre com as datas de atualização da reserva:");
			System.out.print("Data de entrada (DD/MM/AAAA): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de saida (DD/MM/AAAA): ");
			checkOut = sdf.parse(sc.next());
			
			reserva.atualizarDatas(checkIn, checkOut);
	
			System.out.println("Reserva: " + reserva);
		}
		catch(ParseException e) {
			System.out.println("Digitou uma data invalida");
		}catch(DomainException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		
		sc.close();
	}
}
