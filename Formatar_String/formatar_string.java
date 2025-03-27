public class Main {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		//LETRA MINUSCULA
		String minuscula = original.toLowerCase();
		
		
		//LETRA MAIUSCULA
		String maiuscula = original.toUpperCase();
		
		//ELIMINA ESPAÇOS NOS CANTOS DA STRING
		String eliminaEspacos = original.trim();
		
		//CRIA UMA NOVA STRING APARTIR DO CARACTER SELECIONADO
		String novaString = original.substring(3);
		
		//RECORTA A STRING 
		String recortar = original.substring(2,9);
		
		//trocar o valor da string
		String trocar = original.replace('a','X');
		String trocar2 = original.replace("ABC","123");
			

	}