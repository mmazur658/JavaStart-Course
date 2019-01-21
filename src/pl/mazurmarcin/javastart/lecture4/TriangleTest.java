package pl.mazurmarcin.javastart.lecture4;

/**
 * zadanie-java-7
 */
public class TriangleTest {

    public static void main(String[] args) {

        TriangleChecker checker = new TriangleChecker();
        Triangle triangle = new Triangle(4,3,5);

        System.out.println(checker.isRectangular(triangle));

    }
}
