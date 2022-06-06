package Problem_Practice.Lambda_Expression.O7_Stream;


import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Person3> people3 = Arrays.asList(
                new Person3("Imtiaz2", "CHossain2", 223, Gender.MALE),
                new Person3("Imtiaz1", "Hossain1", 123, Gender.MALE),
                new Person3("Mariyam", "AHossain3", 323, Gender.FEMALE),
                new Person3("Mariyam", "AHossain3", 125, Gender.FEMALE),
                new Person3("CImtiaz3", "AHossain3", 323, Gender.MALE),
                new Person3("Sadia", "DHossain4", 423, Gender.FEMALE)
        );


        // Filter
        System.out.println("All Female gender people group -");
        people3.stream()
                .filter((Person3 p) -> p.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach((Person3 p) -> System.out.println(p));
        System.out.println("\n");

        Long l = people3.stream()
                .filter((Person3 p) -> p.getLastName().startsWith("A"))
                .count();
        System.out.println("LastName startsWith A has total people no - " + l);
        System.out.println("\n");

        System.out.println("LastName startsWith A ");
        people3.stream() // This means all people are in something like conveyor belt
                .filter((Person3 p) -> p.getLastName().startsWith("A")) // Filter sees if the last name is starting with letter c == True then go the next step
                .forEach((Person3 p) -> System.out.println(p.getFirstName())); // Each person In conveyor belt print name
        System.out.println("\n");


        // Sort
        System.out.println("Sort by age");
        people3.stream()
                //.sorted(Comparator.comparing((Person3 p) -> p.getAge())) // Sort by age
                //.sorted(Comparator.comparing((Person3 p) -> p.getAge()).reversed()) // Sort by age then reverse
                .sorted(Comparator.comparing((Person3 p) -> p.getAge()).thenComparing((Person3 p) -> p.getGender()))
                .forEach((Person3 p) -> System.out.println(p));
        System.out.println("\n");


        // All match
        boolean allMatch = people3.stream()
                .allMatch((Person3 p) -> p.getAge() > 100);
        System.out.println("All the person has age above 100 ? Ans - " + allMatch + "\n");


        // Any match
        boolean anyMatch = people3.stream()
                .anyMatch((Person3 p) -> p.getAge() > 2000);
        System.out.println("Any of the person has age above 2000 ? Ans - " + anyMatch + "\n");

        Boolean b = people3.stream()
                .anyMatch((Person3 p) -> p.getLastName().startsWith("D"));
        System.out.println("Is any person that LastName startsWith D ? Ans - " + b); // anyMatch predicate return with boolean value.
        System.out.println("\n");


        // None match
        boolean noneMatch = people3.stream()
                .noneMatch((Person3 p) -> p.getLastName().equals("Hossain"));
        System.out.println("No person has last name Hossain ? Ans - " + noneMatch + "\n");

        // Max
        people3.stream()
                .max(Comparator.comparing((Person3 p) -> p.getAge()))
                .ifPresent((Person3 p) -> System.out.println("Person has maximum age is - " + p + "\n"));


        // Max
        people3.stream()
                .min(Comparator.comparing((Person3 p) -> p.getAge()))
                .ifPresent((Person3 p) -> System.out.println("Person has minimum age is - " + p + "\n"));


        // Group
        System.out.println("Group of - ");
        Map<Gender, List<Person3>> groupByGender = people3.stream()
                .collect(Collectors.groupingBy(Person3::getGender));

        groupByGender.forEach((gender, people4) -> {
            System.out.println(gender);
            people4.forEach(System.out::println);
            System.out.println();
        });


    }
}

// Stream -  A sequence of elements supporting sequential and parallel aggregate operations.
// Part 1 - Source, Part 2 - intermediate operation, Part 3 - Terminate operation
// Predicate simply returns true/false
