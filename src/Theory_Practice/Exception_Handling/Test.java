package Theory_Practice.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int x=10,y=12;
        getEAFP();

    }

    private static int divideLBYL(int x, int y){
        if (y != 0) return x/y;
        else return -1;
    }


    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        }catch (ArithmeticException e){
            return -1;
        }
    }


    private static int getLBYL(){
        Scanner scanner = new Scanner(System.in);
       boolean isValid=true;
        System.out.print("Enter value of y- ");
        String y = scanner.next();

        for (int i = 0; i < y.length() ; i++) {
            if (!Character.isDigit(y.charAt(i))) {
                isValid = false;
            }
        }
        if (isValid){
            return Integer.parseInt(y);
        }
        return 0;
    }


    private static void getEAFP(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Int of y- ");
        String y = scanner.next();

        try{
            System.out.println("y= "+scanner.nextInt());
        }catch (InputMismatchException e){
            System.out.println("Invalid Input!!! Try Again");
            getEAFP();
        }
    }




}

