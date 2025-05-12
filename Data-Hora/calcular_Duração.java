package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDate d02 = LocalDate.parse("2022-07-27");

		LocalDateTime d03 = LocalDateTime.parse("2022-07-20T01:30:26");
		LocalDateTime d04 = LocalDateTime.parse("2022-07-27T01:30:26");

		Instant d05 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d06 = Instant.parse("2022-07-27T01:30:26Z");

		// LocalDate
		Duration t1 = Duration.between(d01.atStartOfDay(), d02.atStartOfDay());
		System.out.println(t1.toDays());

		// LocalDateTime
		Duration t2 = Duration.between(d03, d04);
		System.out.println(t2.toDays());

		// Instant
		Duration t3 = Duration.between(d05, d06);
		System.out.println(t3.toDays());

	}
}
