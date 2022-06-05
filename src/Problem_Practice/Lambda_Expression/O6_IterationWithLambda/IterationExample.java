package Problem_Practice.Lambda_Expression.O6_IterationWithLambda;

import Problem_Practice.Lambda_Expression.O4_PersonObjectList.Person;

import java.util.Arrays;
import java.util.List;

public class IterationExample {
    public static void main(String[] args) {
        List<Person2> people2 = Arrays.asList(
                new Person2("Imtiaz1", "Hossain1", 123),
                new Person2("CImtiaz2", "CHossain2", 223),
                new Person2("Imtiaz3", "AHossain3", 323),
                new Person2("CImtiaz4", "DHossain4", 423)
        );

        // Print Using For loop
        System.out.println("Print Using For loop");
        for (int i=0; i<people2.size(); i++){
            System.out.println(people2.get(i));
        }

        // Print Using ForEach loop
        System.out.println("\n\nPrint Using ForEach loop");
        for (Person2 p : people2) {
            System.out.println(p);
        }


        // Print Using Lambda Expression
        System.out.println("\n\nPrint Using Lambda Expression");
        people2.forEach((Person2 p) -> System.out.println(p));
        people2.forEach((Person2 p) -> System.out.println("Name - " + p.getFirstName() + ", Age - " + p.getAge()));

    }
}
