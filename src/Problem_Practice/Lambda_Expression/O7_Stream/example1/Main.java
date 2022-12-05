package Problem_Practice.Lambda_Expression.O7_Stream.example1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        //List names = Arrays.asList("Reflection","Collection","Stream");
        //List result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        List result = names.stream().filter(s -> s.contains("Stream")).collect(Collectors.toList());
        System.out.println(result);

        List<String> names2 = Arrays.asList("Chris", "HTML", "XML", "CSS");
        Stream<String> s = names2.stream().filter(name -> name.startsWith("C"));
        System.out.println(s.collect(Collectors.toList()));
        System.out.println(names2.stream().filter(p -> p.contains("CSS")).count());
    }
}
