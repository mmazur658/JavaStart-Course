package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class PaymentCalculatorApp {

	public static void main(String[] args) {

		Employee employee = new Employee("Marcin", "Mazur", 3000);
		PaymentCalculator paymentCalculator = new PaymentCalculator();
		
		System.out.println("Pensja roczna netto: "+paymentCalculator.nettoYearPayment(employee));
		System.out.println("Pensja roczna Brutto: "+paymentCalculator.bruttoYearPayment(employee));
	}

}
