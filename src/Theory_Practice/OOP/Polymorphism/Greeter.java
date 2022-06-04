package Theory_Practice.OOP.Polymorphism;

class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }
    public void add(Greeting greeting) {
        greeting.add(5,8);
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();

        greeter.greet(helloWorldGreeting);
        greeter.add(helloWorldGreeting);

    }

}
