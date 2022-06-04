package Theory_Practice.Code_With_Imtiaz;

public class Arithmatic_exoression {
    public static void main(String[] args) {


        int s = 10;
        s=15;
        s=20;
        System.out.println(s);
        final int t  = 25;
        //  t=20;   *** not allowed ***
        System.out.println(t);
        System.out.println("---------------------------------");



        int x = 1;
        System.out.println(x);
        System.out.println("---------------------------------");

        int y = ++x; // x=2 y=2
        System.out.println(x);
        System.out.println(y);
        System.out.println("---------------------------------");


       int z = x++; // x=3 y=2 z=2
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("---------------------------------");



        int p = ++x; // x=4 y=2 z=2 p=4
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
        System.out.println("---------------------------------");


        int q = ++p; // x=4 y=2 z=2 p=5 q=5
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
        System.out.println(q);
        System.out.println("---------------------------------");



        int r = z++; // x=4 y=2 z=3 p=5 q=5 r=2
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println("---------------------------------");





        /*int x = 1;
        int y = ++x; // firstly x(1) increment -> x(2),  then value of x(2) copy in y now -> y(2)
        int y = x++; // firstly value of x(1) copy in y -> y(1),  then increment x(1) now -> x(2)

        System.out.println(x);
        System.out.println(y);
        */



    }
}
