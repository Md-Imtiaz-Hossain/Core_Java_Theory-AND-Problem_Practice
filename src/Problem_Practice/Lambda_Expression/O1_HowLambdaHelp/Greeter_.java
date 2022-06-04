package Problem_Practice.Lambda_Expression.O1_HowLambdaHelp;

public class Greeter_ {

    public static void main(String[] args) {

        // This is an instance of a class that implements the greeting interface
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        helloWorldGreeting.perform();


        // This is a lambda expression of type greeting interface
        Greeting myLambdaFunction = () -> System.out.println("Hello World");
        myLambdaFunction.perform();


//        Greeting myLambdaFunction = () -> {
//            System.out.println("Hello World");
//       };

    }

}
