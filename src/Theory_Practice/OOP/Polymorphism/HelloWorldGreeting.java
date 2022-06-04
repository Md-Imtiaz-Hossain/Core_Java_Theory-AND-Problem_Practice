package Theory_Practice.OOP.Polymorphism;

public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello World");
    }

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }


}
