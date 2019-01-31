package pl.mazurmarcin.javastart.podstawy.tablice_wielowymiarowe;

public class ArrayNumbers {

    public static void main(String[] args) {

        double[][] arr = new double[3][3];

        arr[0][0] = 1.0;
        arr[0][1] = 1.5;
        arr[0][2] = 2.0;
        arr[1][0] = 1.5;
        arr[1][1] = 2.0;
        arr[1][2] = 2.5;
        arr[2][0] = 2.0;
        arr[2][1] = 2.5;
        arr[2][2] = 3.0;

        double result = (arr[0][0] * arr[1][1] * arr[2][2]) + (arr[2][0] * arr[1][1] * arr[0][2]);
        System.out.println("Suma iloczynów przekątnych: " + result);

        result = (arr[1][0] + arr[1][1] + arr[1][2]) * (arr[0][1] + arr[1][1] + arr[2][1]);
        System.out.println("Iloczyn sum wiersza i kolumny: " + result);

        result = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][0] + arr[1][2] + arr[2][0] + arr[2][1] + arr[2][2];
        System.out.println("Suma krawędzi: " + result);
    }
}
