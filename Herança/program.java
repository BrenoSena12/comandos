package application;

import entities.Account;
import entities.BusinnesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinnesAccount bacc = new BusinnesAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING 
 
		// é pegar um objeto do tipo BusinnesAccount e atribuir a uma varivel do tipo Account
		Account acc1 = bacc;
		Account acc2 = new BusinnesAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING = Converter um objeto da super-classe para uma sub-classe
		BusinnesAccount acc4 = (BusinnesAccount)acc2;
		acc4.loan(100.0);
		
		if(acc3 instanceof BusinnesAccount) {
			BusinnesAccount acc5 = (BusinnesAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();;
			System.out.println("Update!");
		}
		
	}
}