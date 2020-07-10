package Inhar_it;

public class Test {
    public static void main(String[] args) {

        Point p1 = new Point(1,20 );
        Point p2 = new Point(1,2);
        //Point p2 = p1;


        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        String a;

    }
}
