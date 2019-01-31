package pl.mazurmarcin.javastart.podstawy.operacje_na_plikach;

public class Employee extends Person {


	private static final long serialVersionUID = -3303400874699041045L;
	
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String firstName, String lastName, double salary) {
		super(firstName, lastName);
		this.salary = salary;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return super.toString() + ", wynagrodzenie: " + salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

}
