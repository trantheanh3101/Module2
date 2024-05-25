package TryHard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tesst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        Set<String> set = new HashSet<>();
        set.add("1"); set.add("2");set.add("3"); set.add("4");

        list.forEach(System.out::println);

        int sum = list.stream()
                .filter(value -> value > 0)
                .mapToInt(value -> value)
                .sum();

        set.forEach(System.out::println);
        System.out.println(sum);
    }
}
