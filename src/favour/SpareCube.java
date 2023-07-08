package favour;

public class SpareCube {

    public  static void squareCalculator(){
        System.out.println("number        square       cube");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i +"               "+i*i+"           "+i*i*i);
        }

    }

    public static void main(String[] args) {

        squareCalculator();
    }


}
