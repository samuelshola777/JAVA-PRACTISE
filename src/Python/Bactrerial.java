package Python;

public class Bactrerial {
    public static void main(String[] args) {
        // starting with 200 bacteria, the format


        for (int counter = 0 ; counter < 4; counter++){
            System.out.printf("%9d%9d%n",counter * 5,  200 * (int) Math.pow(2,5) * counter);
        }

    }

}
