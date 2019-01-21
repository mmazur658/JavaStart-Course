package pl.mazurmarcin.javastart.lecture4;

/**
 * zadanie-java-7
 */
public class TriangleChecker {

    public boolean isRectangular(Triangle triangle) {

        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();

        boolean result = false;

        if (c >= a && c >= b) {
            result = ((c * c) == (a * a) + (b * b)) ? true : false;

        } else if (b >= c && b >= a) {
            result = ((b * b) == (a * a) + (c * c)) ? true : false;

        } else if (a >= c && a >= b) {
            result = ((a * a) == (c * c) + (b * b)) ? true : false;

        }
        return result;
    }
}
