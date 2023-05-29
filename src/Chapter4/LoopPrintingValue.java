package Chapter4;

//        Fig. 4.33 | Item values for Exercise 4.19.
//        N N2 N3 N4
//        1 1 1 1
//        2 4 8 16
//        3 9 27 81
//        4 16 64 256
//        5 25 125 62

public class LoopPrintingValue {
    public static void main(String[] args) {

        System.out.println("N N2  N3  N4");
        for (int i = 1; i < 6; i++) {

            System.out.println(i+"  "+i*i+"   "+i*i*i+"  "+i*i*i*i);


        }

    }
}
