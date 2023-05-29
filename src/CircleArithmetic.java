import java.util.Scanner;

public class CircleArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the an radius");
        int radius = input.nextInt();

        System.out.printf("%ndiameter is %d %n", 2 * radius);
        System.out.printf("the circumference %.f%n", 2* Math.PI * radius);
        System.out.printf("the area is %.f%n", Math.PI*radius*radius);

    }
}
