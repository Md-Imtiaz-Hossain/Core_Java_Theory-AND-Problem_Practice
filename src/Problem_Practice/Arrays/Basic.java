package Problem_Practice.Arrays;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Array");

        int[] a = new int[500];
        int[] a2 = {5, 589, 578, 45};


        System.out.println(find_average(new int[]{1,1,9}));

    }


        public static double find_average(int[] array){

            double sum = Arrays.stream(array).sum();
            double total = array.length;

            System.out.println(
                    Arrays.stream(array).average().getAsDouble()
            );

        return sum/total;

        }


}
