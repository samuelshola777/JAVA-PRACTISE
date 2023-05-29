package Python;

public class Array_Bar_Chart {
    public static void main(String[] args) {

        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d %-6s%n", i, "*".repeat(array[i]));
        }
    }
}