package Practice;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {

Random random = new Random();

 int goat = random.nextInt(7);// to secure the limite of the value the random number generate
        // we have to put a value of the range in which we want the limite to be that why i'm having 7 in the parentesse at the back of the method
        // the value 7 is for the computer to generate a value from 0 -  6, cause we'll never get a value of seven just 0 - 6

        System.out.println(goat);




    }

}
