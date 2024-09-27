package sandbox.lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {

    public static void main(String[] args) {

        /*x -> x * 2
        anonymous function

        // same thing ** This is a lambda expression that takes an integer and returns an integer
        public int doubleMe(int x) {
            return x * 2;
        }*/
        /* 4 classes
        predicate - takes 1 value return a boolean*/

        Predicate<String> predicate = x -> x.startsWith("a");

        //function = take 1 value and return 1 value
        Function<Integer, Integer> funtion = x -> {
            x = x + 5;
            return x * 2;
        };

        //supplier = takes no value and returns a value
        Supplier<String> supplier = () -> "hello world!";

        //consumer = takes 1 value and returns no value
        Consumer<String> consumer = System.out::println;
        Consumer<String> consumer2 = x -> System.out.println(x);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }


}
