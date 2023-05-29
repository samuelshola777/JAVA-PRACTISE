package task;

public class DivisibleByThree {
    public static void main(String[] args) {
int total = 0;
        for (int i = 0; i < 30; i++) {
            if (i % 3 == 0) {
                total += i;
            }
        }
        System.out.println("()==> "+ total);

    }
}
