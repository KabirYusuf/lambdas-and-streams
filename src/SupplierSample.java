import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<String> supplier = () ->  "Kabir";

        String name = supplier.get();

        System.out.println(name.toUpperCase());
    }
}
