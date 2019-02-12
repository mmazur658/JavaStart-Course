package pl.mazurmarcin.javastart.lecture11;

public class CashMachineApp {

	public static void main(String[] args) {

		CashMachine cashMachine = new CashMachine(new BankAccount(new Person("Marcin", "Mazur"), 100));
		cashMachine.mainLoop();

	}

}
