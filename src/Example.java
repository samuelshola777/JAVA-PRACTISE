import com.google.common.base.Supplier;

import java.util.Random;
import java.util.function.*;

public class Example {

    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer number) -> System.out.println("number passed to accept :: "+number);
    consumer.accept(5);

        BiConsumer<String, Integer> biConsumer = ( name, age) -> {
            System.out.println(name+ " is"+age+" years old");
        };
biConsumer.accept("amirah",105);


        Predicate<String> predicate = (word)->{
          return word.length() > 3;
        };


        System.out.println(predicate.test("samuelShola"));

        BiPredicate<String, Integer> biPredicate = (word, number)-> word.length() == number;

        Supplier<Integer> supplier = ()->new  Random().nextInt(10);
        for (int i = 0; i < 10; i++) {


        System.out.println(supplier.get()+" ");


            Function<String, Integer> function = (name) -> name.length();
            System.out.println(function.apply("amirah"));


            BiFunction<String, Integer, Boolean> biFunction = (word, number) -> word.length() == number;
            biFunction.apply("Amirah",23);
            System.out.println(biFunction.apply("Amirah",3));


            UnaryOperator<String> unaryOperator =
                    (name)-> String.valueOf(name.length() == 6);
            System.out.println(unaryOperator.apply("samuel"));

            BinaryOperator<String> binaryOperator = (name, word)-> name+ word;
            System.out.println(binaryOperator.apply("samuel", "shola"));
        }
    }

}
