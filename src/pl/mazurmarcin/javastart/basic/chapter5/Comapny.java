package pl.mazurmarcin.javastart.basic.chapter5;

public class Comapny {

    public static void main(String[] args) {

        Employee employeeOne = new Employee();

        employeeOne.setFirstName("Marcin");
        employeeOne.setLastName("Mazur");
        employeeOne.setYearOfBirth("1989-02-15");
        employeeOne.setSeniority(20);

        Employee employeeTwo = new Employee();

        employeeTwo.setFirstName("Karol");
        employeeTwo.setLastName("Zanussi");
        employeeTwo.setYearOfBirth("2000-05-7");
        employeeTwo.setSeniority(7);

        Employee employeeThree= new Employee();

        employeeThree.setFirstName("Mikołaj");
        employeeThree.setLastName("Przybylski");
        employeeThree.setYearOfBirth("1996-09-01");
        employeeThree.setSeniority(2);

        System.out.println("First employee: "+employeeOne.getFirstName()+" "+employeeOne.getLastName()+" "+
                employeeOne.getYearOfBirth()+ " "+ employeeOne.getSeniority());

        System.out.println("Second employee: "+employeeTwo.getFirstName()+" "+employeeTwo.getLastName()+" "+
                employeeTwo.getYearOfBirth()+ " "+ employeeTwo.getSeniority());

        System.out.println("Third employee: "+employeeThree.getFirstName()+" "+employeeThree.getLastName()+" "+
                employeeThree.getYearOfBirth()+ " "+ employeeThree.getSeniority());




    }
}


