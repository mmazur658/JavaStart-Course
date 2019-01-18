package pl.mazurmarcin.javastart.lecture3;

public class TimeMachine {

    public void backInTime(Person person) {
        person.setAge(person.getAge() - 1);
    }

    public void timeTravel(Person person, int ageToCalculate) {
        person.setAge(person.getAge() + ageToCalculate);
    }

    public static void main(String[] args) {

        Person person1 = new Person("John", "Kowalski", 20, "Wrocław");

        TimeMachine timeMachine = new TimeMachine();
        timeMachine.timeTravel(person1, 5);
        System.out.println(person1.getAge());

        timeMachine.backInTime(person1);
        System.out.println(person1.getAge());



    }
}
