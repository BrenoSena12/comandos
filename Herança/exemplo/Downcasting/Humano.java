package application;

public class Humano {

	protected String nome;
	protected Integer idade;
	
	public void whoAmi() {
		System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos ");
	}
	
	public void comunicar() {
		System.out.println("Olá");
	}
}
