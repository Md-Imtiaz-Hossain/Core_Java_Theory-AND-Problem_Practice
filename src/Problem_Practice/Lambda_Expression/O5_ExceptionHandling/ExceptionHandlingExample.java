package Problem_Practice.Lambda_Expression.O5_ExceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        int[] someNumbers = {1, 5, 89, 78};
        int key = 0;

        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }


    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer){
        for (int i : someNumbers){
            consumer.accept(i, key);
        }
    }

    // Wrapper Lambda
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
        return (v, k) -> {
          try{
              consumer.accept(v, k);
          }catch (ArithmeticException e){
              System.out.println("Exception occur in wrapper class");
          }
        };
    }


}
