package Code_With_Mosh;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {




        while (true){


            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number- ");
            int number = input.nextInt();
            int check = number;
            if (number%3==0 && number%5==0){
                System.out.println("FizzBuzz");
            }
            else if (number%5==0){
                System.out.println("Fizz");
            }
            else if (number%3==0){
                System.out.println("Buzz");
            }else{
                System.out.println(check);
                continue;
            }


        }


    }
}
