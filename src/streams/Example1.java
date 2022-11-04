package streams;



import java.util.Arrays;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        Stream<Integer> numberStream = Stream.empty();
        Integer[] numbers = {1,2,3,4,5,6};
        Stream<Integer> integerStream = Arrays.stream(numbers);
        integerStream.filter(num->num % 2 == 0).forEach(numb-> System.out.println(numb));

        Stream<Integer> nums = Stream.generate(()->5);
        nums.limit(10).forEach(n -> System.out.println(n));

    }
}
