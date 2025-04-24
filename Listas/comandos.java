//*PASSO 01*
    //DECLARANDO UMA LISTA
    List<String> lista_nomes; // não aceita tipos primitivos. Usa-se a wrapper class.

//*PASSO 02*
    //INSTANCIAÇÃO DA LISTA
    List<String> lista_nomes = new ArrayList<>();


//ADICIONAR ELEMENTOS
    lista_nomes.add("Maria");
    lista_nomes.add("Alex");
    lista_nomes.add("Bob");
    lista_nomes.add("Anna");

//INSERIR ELEMENTO EM POSIÇÃO ESPECIFICA
    lista_nomes.add(2,"Marco");

//VER TAMANHO DA LISTA
	System.out.println(lista_nomes.size());

//REMOVER ELEMENTO DA LISTA 
	lista_nomes.remove("Anna");
    lista_nomes.remove(1);

//REMOVER ELEMENTOS QUE ATENDEM UM PREDICADO
	lista_nomes.removeIf(y -> y.charAt(0) == 'M');

// ENCONTRAR POSIÇÃO DO ELEMENTO
	System.out.println(lista_nomes.indexOf("Bob"));

//FILTRA LISTA SEM APAGAR A LISTA ANTERIOR
	List<String> result = lista_nomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

//ENCONTRAR PRIMEIRO ELEMENTO COM UM CARACTERISTICA ESPECIFICA
	String nome = lista_nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
	System.out.println(nome);