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

// TRÁS O DADO DA LISTA
    System.out.println(listaFuncionario.get(0).getNome());

    
//INSERIR ELEMENTO EM POSIÇÃO ESPECIFICA
    lista_nomes.add(2,"Marco");


// RETORNAR ELEMENTO DA POSIÇÃO
    System.out.println(lista_nomes.get(0)); 


// ENCONTRAR POSIÇÃO DO ELEMENTO
	System.out.println(lista_nomes.indexOf("Bob"));
    

//VER TAMANHO DA LISTA
	System.out.println(lista_nomes.size());


// LIMPAR LISTA 
    Linsta_nomes.clear();


//REMOVER ELEMENTO DA LISTA 
	lista_nomes.remove("Anna");
    lista_nomes.remove(1);


//REMOVER ELEMENTOS QUE ATENDEM UM PREDICADO
	lista_nomes.removeIf(y -> y.charAt(0) == 'M');


//FILTRA LISTA SEM APAGAR A LISTA ANTERIOR
	List<String> result = lista_nomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());


//ENCONTRAR PRIMEIRO ELEMENTO COM UM CARACTERISTICA ESPECIFICA
	String nome = lista_nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
	System.out.println(nome);