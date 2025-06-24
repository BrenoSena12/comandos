package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	// ATRIBUTOS
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	// está com static para que não instancie para cada objeto Reserva que a aplicação tiver
	// irei usar apenas um toda vez.
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 
	// CONSTRUTOR
	public Reserva() {
	}

	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	// ENCAPSULAMENTO
	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getChekIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	// METODOS
	public long duracao() {
		long diferenca = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
	
	/* long = é o inteiro mais longo;
	   .getTime = retorna a quantidade de milisegundos da data;
	   TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS); = converte os valores de milisegundos para dias.
	 */
	
	public void atualizarDatas(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Quarto "
			+ numeroQuarto
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duracao()
			+ " noites";
	}
}
