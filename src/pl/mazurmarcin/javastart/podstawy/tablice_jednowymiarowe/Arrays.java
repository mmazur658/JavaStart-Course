package pl.mazurmarcin.javastart.podstawy.tablice_jednowymiarowe;

public class Arrays {

    public static void main(String[] args) {

        int[] array1 = {1,2,3};
        int[] array2 = new int[3];

        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;

        System.out.println("Suma dwóch tablic: "+(array2[0]+array2[1]+array2[2]+array1[0]+array1[1]+array1[2]));

    }
}
