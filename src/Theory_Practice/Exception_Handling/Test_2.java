package Theory_Practice.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        int result = divide();
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.println("X- "+x+", Y- "+y);
        return x/y;

    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an Integer- ");

        while (true){
            try{
                return s.nextInt();
            }catch (InputMismatchException e){
                s.nextLine();
                System.out.println("Please enter a NUMBER -");
            }
        }
    }
}
