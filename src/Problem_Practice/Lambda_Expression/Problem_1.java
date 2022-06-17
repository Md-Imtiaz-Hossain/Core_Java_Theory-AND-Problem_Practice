package Problem_Practice.Lambda_Expression;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem_1 {
    public static void main(String[] args) {

        add result = (int a, int b) -> 5 + 10;
        System.out.println(result);


        //IntStream.rangeClosed(0, 100).forEach(System.out::println);
        //IntStream.rangeClosed(0,100).filter((ar)->ar%2==0).forEach((aa)-> System.out.println(aa));


        List<Integer> list = IntStream.range(0, 100).filter(i -> isPrime(i)).boxed().collect(Collectors.toList());
        System.out.println(list);


        IntStream.range(0, 100)
                .filter(numbers -> {
                    return numbers > 1
                            &&
                            IntStream.rangeClosed(2, numbers / 2)
                                    .noneMatch(ii -> numbers % ii == 0);
                })
                .forEach(ab -> System.out.println(ab));

        System.out.println(Integer.toBinaryString(50));
        System.out.println(toBinary(50));


    }


    interface add {
        int addition(int a, int b);
    }

    static boolean isPrime(int number) {
        return number > 1 &&
                IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }


}

