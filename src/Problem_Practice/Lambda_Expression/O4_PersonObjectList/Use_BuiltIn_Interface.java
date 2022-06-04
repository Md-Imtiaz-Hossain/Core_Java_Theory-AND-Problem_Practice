package Problem_Practice.Lambda_Expression.O4_PersonObjectList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Use_BuiltIn_Interface {
    public static void main(String[] args) {


        List<Person> people3 = Arrays.asList(
                new Person("Imtiaz1", "Hossain1", 123),
                new Person("CImtiaz2", "CHossain2", 223),
                new Person("Imtiaz3", "AHossain3", 323),
                new Person("CImtiaz4", "DHossain4", 423)
        );

        // Step - 1:  Sort list by last name
        Collections.sort(people3, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step - 2: print all elements
        System.out.println("Print All person information after sorting");
        printWithCondition(people3, (Person p) -> true, (Person p) -> System.out.println(p));

        // Step - 3: print all people3 that have last name begin with c
        System.out.println("\nprint All Contain With C in last name");
        printWithCondition(people3, (Person p) -> p.getLastName().startsWith("C"), (Person p) -> System.out.println(p) );

        System.out.println("\nPrint All Contain With C in first name");
        printWithCondition(people3, (Person p) -> p.getFirstName().startsWith("I") , (Person p) -> System.out.println(p.getFirstName()));

    }

    // All method here-

    private static void printWithCondition(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : personList) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }

}


// Predicate<T>, Consumer<T>
// Both are builtin functional interface. So we can use it rather than create an interface.
// This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
// Predicate --> test(T t) boolean methode is Evaluates this predicate on the given argument.
// Consumer --> accept(T t) void Methode Performs this operation on the given argument.
// https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
// https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html