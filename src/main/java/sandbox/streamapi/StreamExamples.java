package sandbox.streamapi;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamExamples {

    public static void main(String[] args) {

        //test data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
        List<String> names = Arrays.asList("reflection", "collection", "stream", "Stream", "java");
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;

        //intermediate operations
        //map
        List<Integer> square = numbers
                .stream()
                .map(x -> x * x) //monad
                .collect(Collectors.toList());
        square.forEach(System.out::println);

        //filter
        List<String> result = names
                .stream()
                .filter(s -> s.toLowerCase().startsWith("r"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        //sorted
        List<String> result2 = names
                .stream()
                .sorted((s1, s2) -> s2.compareTo(s1)) // sorts reverse order
                .collect(Collectors.toList());
        result2.forEach(System.out::println);

        //terminal operations
        //collect
        Set<Integer> squared = numbers
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        squared.forEach(System.out::println);

        //forEach
        numbers
                .stream()
                .map(x -> x * 2)
                .forEach(System.out::println);
        numbers.forEach(System.out::println); // for(Integer I : numbers) { System.out.println(I); }

        //reduce
        int sum = 0;
        for (int x = 1; x <= 5; x++) {
            if (x % 2 == 0) {
            sum += x;
            }
        }
        System.out.println("even sum: " + sum);

        int evenSum = numbers
                .stream()
                .filter(evenOnlyPredicate)
                .reduce(0, (acc, x) -> acc + x);
        System.out.println("even sum: " + evenSum);

        //examples
        int totalSum = IntStream.iterate(0, x -> x + 1)
                .skip(5)
                .limit(5)
                .filter(evenOnly)
                .reduce(2, Integer::sum);
        System.out.println("total sum: " + totalSum);

        //random ints
        Random random = new Random();
        random.ints(1, 11)
                .limit(50)
                .forEach(System.out::println);

    }
}
