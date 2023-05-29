package Chapter8;

import java.util.Scanner;

public class Cylinder {

    private static double radius = 1;
    private static double height = 1;
    private static double volume;
 static    Scanner scanner = new Scanner(System.in);


    public static void setVolume(double volume) {
        volume = (22 * radius * radius * height ) / 7;
        Cylinder.volume = volume;
    }

    public static double getVolume() {
        return volume;
    }

    public static void main(String[] args) {
        System.out.println("enter volume of the cylinder");
       double vo = scanner.nextInt();
        setVolume(vo);
        System.out.println(getVolume());
    }
}
