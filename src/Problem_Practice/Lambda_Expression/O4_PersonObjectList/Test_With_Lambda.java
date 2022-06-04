package Problem_Practice.Lambda_Expression.O4_PersonObjectList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test_With_Lambda {
    public static void main(String[] args) {


        List<Person> people2 = Arrays.asList(
                new Person("Imtiaz1", "Hossain1", 123),
                new Person("CImtiaz2", "CHossain2", 223),
                new Person("Imtiaz3", "AHossain3", 323),
                new Person("CImtiaz4", "DHossain4", 423)
        );

        // Step - 1:  Sort list by last name
        Collections.sort(people2, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step - 2: print all elements
        System.out.println("Print All person information after sorting");
        printWithCondition(people2, (Person p) -> true);

        // Step - 3: print all people2 that have last name begin with c
        System.out.println("\nprint All Contain With C in last name");
        printWithCondition(people2, (Person p) -> p.getLastName().startsWith("C") );

        System.out.println("\nPrint All Contain With C in first name");
        printWithCondition(people2, (Person p) -> p.getFirstName().startsWith("I") );

    }

    // All method here-

    private static void printWithCondition(List<Person> personList, Condition condition) {
        for (Person p : personList) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    interface Condition{
        boolean test(Person p);
    }

}
