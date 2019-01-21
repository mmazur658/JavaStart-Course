package pl.mazurmarcin.javastart.lecture1;

/**
 * Argumenty wywołania programu
 */
public class FirstArray {

    public static void main(String[] args) {

        // The first table
        int[] array = {1,2,7};

        // show the length of the array
        System.out.println(array.length);

        // show the all values of the array
        for(int i=0; i< array.length; i++)
            System.out.print(array[i]+", ");

        System.out.println();

        // show the square value of the all elements of the array
        for(int i=0; i< array.length; i++)
            System.out.print((array[i]*array[i])+", ");

        System.out.println();

        // show the sum of the all elements of the array
        int sum = 0;
        for(int number : array)
            sum += number;

        System.out.println(sum);
    }
}
