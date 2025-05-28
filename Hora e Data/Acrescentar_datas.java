// SUBTRAIR LOCALDATE
	LocalDate data_local = LocalDate.parse("2022-07-20");

	LocalDate subtrair_dia = data_local.minusDays(7);
	System.out.println(subtrair_dia);

	LocalDate subtrair_mes = data_local.minusMonths(7);
	System.out.println(subtrair_mes);

	LocalDate subtrair_ano = data_local.minusYears(7);
	System.out.println(subtrair_ano);



// ADICIONAR LOCALDATE
	LocalDate data_local = LocalDate.parse("2022-07-20");

	LocalDate adicionar_dia = data_local.plusDays(7);
	System.out.println(adicionar_dia);

	LocalDate adicionar_mes = data_local.plusMonths(7);
	System.out.println(adicionar_mes);

	LocalDate adicionar_ano = data_local.plusYears(7);
	System.out.println(adicionar_ano);



// LocalDateTime
	LocalDateTime data_hora_local = LocalDateTime.parse("2022-07-20T01:30:26");

	LocalDateTime menos_dia = data_hora_local.minusDays(7);
	LocalDateTime mais_dia = data_hora_local.plusDays(7);
	System.out.println(menos_dia);
	System.out.println(mais_dia);



// Instant
	Instant data_hora_global = Instant.parse("2022-07-20T01:30:26Z");

	Instant menos = data_hora_global.minus(7, ChronoUnit.DAYS);
	Instant mais = data_hora_global.plus(7, ChronoUnit.DAYS);
	System.out.println(menos);
	System.out.println(mais);
	