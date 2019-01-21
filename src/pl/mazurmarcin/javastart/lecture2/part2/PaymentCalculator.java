package pl.mazurmarcin.javastart.lecture2.part2;

public class PaymentCalculator {

    static double nettoYearPayment(Employee employee) {
        return (employee.monthlySalary * 12)+(12*1000); // dokończyć
    }

    static double bruttoYearPayment(Employee employee) {
        return employee.monthlySalary * 12;
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Marcin", "Mazur", 3000);

        double nettoYearPayment = nettoYearPayment(employee);
        double bruttoYearPayment = bruttoYearPayment(employee);

        System.out.println("Netto: "+nettoYearPayment+", brutto: "+bruttoYearPayment);

    }
}
