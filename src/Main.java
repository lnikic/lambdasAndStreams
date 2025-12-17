import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Bird bObj =val -> System.out.println("Eagle bird impl from lambdas");
        bObj.canFly("verical");


        List<Integer> nums = List.of(3, 6, 1, 8, 5, 7, 2, 4);

        Function<Integer, Integer> fun =n -> n *2;


        var num = nums.stream()
                .filter(n -> n % 2 == 1)
                .sorted()
                .map(fun)
                .reduce(0, (c, e) -> c + e);
        System.out.println(num);

        List<String> coffees = List.of("Cappuccino",
                "Americano", "Espresso", "Cortado", "Mocha",
                "Cappuccino", "Flat White", "Latte");
        List<String> coffeesEndingInO = coffees.stream()
                .filter(s -> s.endsWith("o"))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(coffeesEndingInO);


        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        List<String> result = strings.stream()
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .skip(2)
                .limit(4)
                .collect(Collectors.toList());

        System.out.println("result = " + result);

//        Stream<String> stream = strings.stream();
//        Stream<String> limit = stream.limit(4);
//        List<String> result = limit.collect(Collectors.toList());

//        List<Integer> nums = List.of(1, 2, 3, 4, 5);
//        String output = "";
//        for (int i = 0; i <= nums.size(); i++){
//            output += nums.get(i) + " ";
//        }
//        System.out.println(output);
    }
}