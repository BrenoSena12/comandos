package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
	}
	
	public HourContract(Date date, Double valueDouble, Integer hours) {
		this.date = date;
		this.valuePerHour = valueDouble;
		this.hours = hours;
	}
	
	
	
	
	
}
