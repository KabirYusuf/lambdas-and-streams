package streams;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        System.out.println(numbers.stream().map(n -> n * 2).reduce(0, (i, j) -> i + j));
    }

}
