package Theory_Practice.Code_With_Imtiaz;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {


        System.out.println(" =========== Implicit Casting ===========\n" +
                "         Happen Automaticly\n" +
                "         Numaric data type,s -> small to bidder\n" +
                "         No Data loss");



        byte b = 10;
        int result = b + 2;
        System.out.println("byte to int - "+result);

        float f = 10.2f;
        double result2 = f + 2;
        System.out.println("Float to double (10.2+2)- "+result2);

        System.out.println("\n\n=========== Explicit Casting ===========\n" +
                "         Happen not Automaticly\n" +
                "         Numaric data type,s -> bigger to smaller\n" +
                "         Data loss happen");



        int i2 = 10;
        byte result3 = (byte) (i2 + 2);
        System.out.println("int to byte - "+result3);

        double d = 10.2;
        int result4 = (int) (d+10.2f);
        System.out.println("double to float (10.2+10.2)--> "+result4);


        System.out.println("\n\n=========== String to numaric Casting ===========" +
                "\n \t\tString to - int / byte / double....");

        String s = "20";
        int result5 =Integer.parseInt(s)+5;
        System.out.println("String 20 + int 5 = "+result5);


        System.out.println("\n\n =========== trim() method works ======");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name \nwith start lots of space " +
                "\n then see output- ");
        String name = input.nextLine().trim();
        System.out.println("Yu name - "+name);



        System.out.println("\n\n=========== Bigger to smaller ===========" +
                " \ndouble > float > long > int > short > byte\n");

    }
}
