package Code_With_Mosh;

import java.util.Arrays;

public class Array_prac {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(5);
        numbers.insert(565);
        numbers.insert(55);
        numbers.insert(578);
        numbers.insert(51);
        numbers.print();
        numbers.delete();
        numbers.print();
        numbers.delete();
        numbers.print();

        numbers.delete();
        numbers.print();


        numbers.delete();
        numbers.print();

        numbers.delete();
        numbers.print();

        numbers.insert(50);
        numbers.print();


    }
}
