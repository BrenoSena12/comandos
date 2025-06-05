package application;

public class Program {

	public static void main(String[] args) {
		
		MutanteAereo anjo = new MutanteAereo();
		anjo.nome = "Gabriel";
		anjo.idade = 309002;
		anjo.whoAmi();
		
		/* FUNCIONA
		Humano h = new Humano();
		h.nome = "Larback Soares";
		h.idade = 40;
		h.whoAmi();
		*/
		
		Humano h;
		h = anjo;
		h.nome = "Larback Soares";
		h.idade = 40;
		h.whoAmi();
		
		h.voar(); // NÃO FUNCIONA POIS SÓ TEM ACESSO A SUPER-CLASSE
		// esse metodo só existe na sub-classe
		
	}
}
