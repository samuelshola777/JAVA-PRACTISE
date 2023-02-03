import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class bStream {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

//
//        for (int i = 0; i < 5; i++) {
//            numbers.add(i,i*2);
//        }
//      Stream<Integer> stream = numbers.stream(.forEach(numbers)->System.out.println(numbers));
//    }

        Stream <Integer> emptyStream = Stream.empty();
        emptyStream.forEach(n -> System.out.println(n));

        Stream <Integer> nums = Stream.generate(()-> new Random().nextInt(10));
        for (int i = 0; i < 10; i++) {
            System.out.println(nums);
        }

        int sum = IntStream.rangeClosed(2,20) .filter((n)->n%2==0).sum();
        System.out.println(sum);


    }
}
