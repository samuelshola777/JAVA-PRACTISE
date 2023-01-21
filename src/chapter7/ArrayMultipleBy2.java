package chapter7;

public class ArrayMultipleBy2 {
    public static void main(String[] args) {

      final int ARRAY_LENGTH = 20;

      int[] array = new int [ARRAY_LENGTH];

        System.out.println("  time     value");


      for (int time = 0; time < array.length; time++){
array[time] =+2 * time ;
          System.out.printf("%7d%7d%n",time ,array[time]);
      }

    }
}
