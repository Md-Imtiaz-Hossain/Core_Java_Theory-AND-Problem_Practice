package Theory_Practice.Code_With_Imtiaz;

public class Math_Class {
    public static void main(String[] args) {
        int i =Math.round(1.4f);
        int i2 =Math.round(1.5f);
        int i3 = (int) Math.ceil(1.1f);
        int i4 = (int) Math.floor(1.9f);
        int i5 = Math.max(5,9);
        double i6 = Math.random();
        int i7 =(int) (Math.random()*100);

        System.out.println("Round figur of 1.4 - "+i);
        System.out.println("Round figur of 1.5 - "+i2);
        System.out.println("1.1 upper Round Fig - "+i3);
        System.out.println("1.9 upper Round Fig - "+i4);
        System.out.println("Max value (5,9) - "+i5);
        System.out.println("Random number (0 to 1) - "+i6);
        System.out.println("Random number (0 to 100) - "+i7);


    }
}
