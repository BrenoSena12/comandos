/******************************  DATA E HORA  ******************************/

// INSTANCIAR COM A DATA DE AGORA ( ano / mes / dia )
    LocalDate dataAgroa = LocalDate.now();
    System.out.println(dataAgroa);

// INSTANCIAR COM A DATA E HORA DE AGORA ( ano / mes / dia - hora)
    LocalDateTime dataHoraAgroa = LocalDateTime.now();
    System.out.println(dataHoraAgroa);

// DATA HORA GLOBAL - LONDRES ( ano / mes / dia T-hora-Z)
    Instant dataHoraAgoraLondres = Instant.now();
    System.out.println(dataHoraAgoraLondres);

// TRANSFORMAR TEXTO EM DATA
    LocalDate textoEmData = LocalDate.parse("2025-05-09");
    System.out.println(textoEmData);

// TRANSFORMAR TEXTO EM DATA HORA
    LocalDateTime textoEmDataHora = LocalDateTime.parse("2025-05-09T01:30:36");
    System.out.println(textoEmDataHora);

// TRANSFORMAR TEXTO CUSTOMIZADO E DATA 
    DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate customizado1 = LocalDate.parse("08/03/2004", formato1);
    LocalDate customizado2 = LocalDate.parse("09/03/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    System.out.println(customizado1);
    System.out.println(customizado2);
    
// TRANSFORMAR TEXTO CUSTOMIZADO E DATA HORA
    DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    LocalDateTime customizado3 = LocalDateTime.parse("08/03/2004 01:30", formato2);
    LocalDateTime customizado4 = LocalDateTime.parse("09/03/2004 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    System.out.println(customizado3);
    System.out.println(customizado4);

// ACEITA DATA POR PARTES
    LocalDate data = LocalDate.of(2019, 8, 26);
    System.out.println(data);


