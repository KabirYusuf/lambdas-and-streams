import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (name, age)-> System.out.println(name+"      "+age);
        biConsumer.accept("Rachael", 102);


        Map<String, Integer> mapOfPersons = Map.of(
                "Banke", 38,
                "Temi", 56,
                "Hadiza", 150
                );


        mapOfPersons.forEach((name, age)-> System.out.println(name+"   "+age));

        mapOfPersons.forEach(biConsumer);
    }
}
