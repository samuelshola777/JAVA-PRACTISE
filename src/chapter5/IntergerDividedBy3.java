package chapter5;

public class IntergerDividedBy3 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <30+1 ; i++) {
            num += i;
            System.out.println("num at this point  "+num);
            num /= 3;

        }
        System.out.println(num);
    }
}
