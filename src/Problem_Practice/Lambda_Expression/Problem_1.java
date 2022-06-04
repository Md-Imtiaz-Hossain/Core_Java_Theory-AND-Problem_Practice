package Problem_Practice.Lambda_Expression;

public class Problem_1 {
    public static void main(String[] args) {

        add result = (int a, int b) -> 5+10;
        System.out.println(result);

        
    }


    interface add{
        int addition(int a, int b);
    }
}

