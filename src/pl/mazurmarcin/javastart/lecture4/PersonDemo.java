package pl.mazurmarcin.javastart.lecture4;

public class PersonDemo {

    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski");
        Person person2 = person1;
        Person person3 = person2;

        System.out.println("p1: " + person1);
        System.out.println("p2: " + person2);
        System.out.println("p3: " + person3);

        person2 = new Person("Antoni", "Paderewski");

        System.out.println("p1: " + person1);
        System.out.println("p2: " + person2);
        System.out.println("p3: " + person3);


    }
}
