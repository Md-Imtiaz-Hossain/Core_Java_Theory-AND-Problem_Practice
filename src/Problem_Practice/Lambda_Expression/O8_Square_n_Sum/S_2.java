package Problem_Practice.Lambda_Expression.O8_Square_n_Sum;

import java.util.Arrays;

public class S_2 {
    public static void main(String[] args) {
        squareSum();
    }

    public static void squareSum() {

        int[] array = {1, 2, 3, 4, 5};

        // ========================== Without Lambda =================================
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] * array[i] > 3) {
                System.out.println(array[i] * array[i]);
                sum += array[i] * array[i];
            }
        }
        System.out.println("Sum- " + sum);


        // ========================== With Lambda =================================
        Arrays.stream(array).map(x -> x * x).filter((z) -> z > 3).forEach(x -> System.out.println(x));
        System.out.println("Sum- " + Arrays.stream(array).map(x -> x * x).filter((z) -> z > 3).sum());
    }


}


// Write a function that print square of array element which is grater than 3,
// And Print Sum of value
//  [1, 2, 2] -->  4 4 and sum = 8
//  [1, 2, 3, 4] --> 4 9 16 and sum = 29


