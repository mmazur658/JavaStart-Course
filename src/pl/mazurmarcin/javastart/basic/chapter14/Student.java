package pl.mazurmarcin.javastart.basic.chapter14;

public class Student {

    private String firstName;
    private String lastName;
    private int indexNumber;
    private static int numberOfStudents = 0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public Student(String firstName, String lastName, int indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        increaseNumberOfStudents();
    }

    public Student() {
        increaseNumberOfStudents();
    }

    void increaseNumberOfStudents() {
        numberOfStudents += 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", indexNumber=" + indexNumber +
                '}';
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void setNumberOfStudents(int numberOfStudents) {
        Student.numberOfStudents = numberOfStudents;
    }
}
