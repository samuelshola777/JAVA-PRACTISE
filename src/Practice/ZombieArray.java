package Practice;

public class ZombieArray {
    public static void main(String[] args) {



int [] [] lotteryCard = {  {20, 15, 7} ,
                             {8, 7,  19},
                            { 7, 13,  47},


};
        System.out.println(lotteryCard [2] [2]);


        System.out.println("----------------------");

        for (int i = 0; i < 3; i++){
            System.out.println(lotteryCard [2] [2]);
        }
        System.out.println("----------------------");
        for (int i = 0; i < 3; i++){
            System.out.println(lotteryCard [i] [i]);
        }
        System.out.println("----------------------");
        for (int j = 0; j < 3; j++){
            System.out.println(lotteryCard [j] [j]);
            for (int i = 0; i < 3; i++){
                System.out.println(lotteryCard [i] [i]);
                if (i == 3){
                    System.out.println();
                }
            }
        }
    }
}
