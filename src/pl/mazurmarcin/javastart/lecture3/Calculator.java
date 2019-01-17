package pl.mazurmarcin.javastart.lecture3;

public class Calculator {

    void sumAndShow(int a, int b) {
        int sum = sumAndReturn(a, b);
        System.out.println(sum);
    }

    int sumAndReturn(int a, int b) {
        int sum = a + b;
        return sum;
    }

    double multiply(double a, double b, double c){
        return a*b*c;
    }

    void subtractAndShow(double a, double b){
        double result = subtract(a,b);
        System.out.println(result);
    }

    double subtract(double a, double b) {
        return a/b;
    }
}
