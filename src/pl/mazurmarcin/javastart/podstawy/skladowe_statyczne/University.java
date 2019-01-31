package pl.mazurmarcin.javastart.podstawy.skladowe_statyczne;

public class University {

    public static void main(String[] args) {

        Student student1 = new Student("Marcin","Mazur",101);
        System.out.println("Number of students: "+Student.getNumberOfStudents());

        Student student2 = new Student("Michał","Zabłocki",102);
        System.out.println("Number of students: "+Student.getNumberOfStudents());

    }
}
