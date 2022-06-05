package Problem_Practice.Lambda_Expression.O7_Stream;


import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Person3> people3 = Arrays.asList(
                new Person3("Imtiaz1", "Hossain1", 123),
                new Person3("Imtiaz2", "CHossain2", 223),
                new Person3("CImtiaz3", "AHossain3", 323),
                new Person3("CImtiaz3", "AHossain3", 323),
                new Person3("CImtiaz4", "DHossain4", 423)
        );

        people3.stream() // This means all people are in something like conveyor belt
                .filter((Person3 p ) -> p.getLastName().startsWith("A")) // Filter sees if the last name is starting with letter c == True then go the next step
                .forEach( (Person3 p) -> System.out.println(p.getFirstName())); // Each person In conveyor belt print name


        Long l = people3.stream()
                .filter((Person3 p) -> p.getLastName().startsWith("A"))
                .count();
        System.out.println("LastName startsWith A has total people no - " + l);

        Boolean b = people3.stream()
                .anyMatch((Person3 p) -> p.getLastName().startsWith("D"));

        System.out.println("Is any person that LastName startsWith D ? Ans - " + b); // anyMatch predicate return with boolean value.
    }
}

// Stream -  A sequence of elements supporting sequential and parallel aggregate operations.
// Part 1 - Source, Part 2 - condition, Part 3 - Termination
