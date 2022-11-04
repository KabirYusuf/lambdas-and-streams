import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate = (number, word)-> word.length() == number;
        System.out.println(biPredicate.test(5, "delem"));
    }
}
