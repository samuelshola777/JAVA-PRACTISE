package task;

public class OneLetterINTwoLine {
    public static void main(String[] args) {

        String name = "VENTURE";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i)+" ,");
            if (i == 3) System.out.println();

        }

    }
}
