package Problem_Practice.Lambda_Expression.O4_PersonObjectList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_Without_Lambda {
    public static void main(String[] args) {


        List<Person> people = Arrays.asList(
                new Person("Imtiaz1", "Hossain1", 123),
                new Person("CImtiaz2", "CHossain2", 223),
                new Person("Imtiaz3", "AHossain3", 323),
                new Person("CImtiaz4", "DHossain4", 423)
        );

        // Step - 1:  Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        // Step - 2: print all elements
        System.out.println("Print All person information");
        printAll(people);

        // Step - 3: print all people that have last name begin with c
        System.out.println("\nprint All Contain With C in last name");
        printWithCondition(people, new Condition(){
            @Override
            public boolean test(Person p){
                return p.getLastName().startsWith("C");
            }
        });


        System.out.println("\nPrint All Contain With C in first name");
        printWithCondition(people, new Condition(){
            @Override
            public boolean test(Person p){
                return p.getFirstName().startsWith("C");
            }
        });


    }

    // All method here-

    private static void printWithCondition(List<Person> personList, Condition condition) {
        for (Person p : personList) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> personList) {
        for (Person p : personList) {
            System.out.println(p);
        }
    }

    interface Condition{
        boolean test(Person p);
    }

}
