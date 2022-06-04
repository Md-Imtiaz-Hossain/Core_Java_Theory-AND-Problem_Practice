package Problem_Practice.Lambda_Expression.O3_Functional_Interface;

public class Test_F_I {
    public static void main(String[] args) {
        GreetingAll greetingAllLambda = () -> System.out.println("Hello World");
        greetingAllLambda.per();

        // Functional Interface - https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

    }
}
