import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (firstName, secondName)->firstName+secondName;

        System.out.println(biFunction.apply("Kabir", "Yusuf"));
    }
}
