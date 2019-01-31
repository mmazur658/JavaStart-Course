package pl.mazurmarcin.javastart.podstawy.klasy_i_obiekty;

public class Employee {

    private String firstName;
    private String lastName;
    private String yearOfBirth;
    private int seniority;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
}
