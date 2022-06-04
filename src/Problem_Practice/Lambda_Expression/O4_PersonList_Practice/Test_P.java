package Problem_Practice.Lambda_Expression.O4_PersonList_Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_P {
    public static void main(String[] args) {


        List<Person> people = Arrays.asList(
                new Person("Imtiaz1", "Hossain1", 123),
                new Person("CImtiaz2", "CHossain2", 223),
                new Person("Imtiaz3", "AHossain3", 323),
                new Person("CImtiaz4", "DHossain4", 423)
        );

        // Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });


        // print all elements
        printAll(people);
        System.out.println();


        // print all people that have last name begin with c
        printAllContainWithC(people);


    }

    private static void printAllContainWithC(List<Person> personList) {
        for (Person p : personList){
            if (p.getFirstName().startsWith("C")){
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> personList) {
        for (Person p: personList) {
            System.out.println(p);
        }
    }


}
