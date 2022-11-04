import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (num1, num2)->num1 * num2;

        System.out.println(binaryOperator.apply(4, 50));

        DoubleBinaryOperator doubleBinaryOperator = (num3, num4)->num3 + num4;

        System.out.println(doubleBinaryOperator.applyAsDouble(3.0, 5.8));
    }
}
