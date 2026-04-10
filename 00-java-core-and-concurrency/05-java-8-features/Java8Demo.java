import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Java8Demo {
    public static void main(String[] args) {

        // Lambda Expression
        Runnable r = () -> System.out.println("Lambda Running");
        r.run();

        System.out.println();

        // Functional Interface
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        System.out.println();

        // Streams API
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .collect(Collectors.toList());

        System.out.println("Processed List: " + result);

        System.out.println();

        // Method Reference
        list.forEach(System.out::println);

        System.out.println();

        // Optional
        Optional<String> name = Optional.ofNullable("Lakshay");

        String value = name.orElse("Default");
        System.out.println("Optional Value: " + value);
    }
}