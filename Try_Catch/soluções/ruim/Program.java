package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reserva;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Numero do quarto: ");
		int numeroQuarto = sc.nextInt();
		System.out.print("Data de entrada (DD/MM/AAAA): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data de saida (DD/MM/AAAA): ");
		Date checkOut = sdf.parse(sc.next());
		
		/*
		o que o if está dizendo = se a saida não é depois da entrada
		.after() = testa se uma data é depois da outra
		*/
		if(!checkOut.after(checkIn)) {
			System.out.println("erro na reserva: a data de saida deve ser posterior à data de entrada");
		}else {
			Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			System.out.println("Entre com as datas de atualização da reserva:");
			System.out.print("Data de entrada (DD/MM/AAAA): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de saida (DD/MM/AAAA): ");
			checkOut = sdf.parse(sc.next());
			
			String error = reserva.atualizarDatas(checkIn, checkOut);
			if(error != null) {
				System.out.println("Erro na reserva: " + error);
			}
			else {
				System.out.println("Reserva: " + reserva);
			}
		}
		sc.close();
	}
}
