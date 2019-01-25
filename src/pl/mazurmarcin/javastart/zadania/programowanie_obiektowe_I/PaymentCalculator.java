package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class PaymentCalculator {
	
	private final static double MONTHLY_ZUS = 1000;
	
	public double nettoYearPayment(Employee employee){		
		return employee.getNettoSalary() * 12;
		
	}
	
	public double bruttoYearPayment(Employee employee){		
		return (employee.getNettoSalary()/0.8 + MONTHLY_ZUS)*12;
		
	}

}
