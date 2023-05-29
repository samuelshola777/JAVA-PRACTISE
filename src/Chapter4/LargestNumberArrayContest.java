package Chapter4;
//(Find the Largest Number) The process of finding the largest value is used frequently in computer applications. For example, a program that determines the winner of a sales contest would input
//        the number of units sold by each salesperson. The salesperson who sells the most units wins the contest. Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines and prints the largest integer. Your program should use at least the following three variables:
//        a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
//        input and to determine when all 10 numbers have been processed).
//        b) number: The integer most recently input by the user.
//        c) largest: The largest number found so far

public class LargestNumberArrayContest {
    public static void main(String[] args) {
        System.out.println("please enter the number your sale people  ");
        int sales = MilePerGarlon2.tryAndCatch();

        int[] salespeople =new int [sales];
        int largest = salespeople[0];
        for (int i = 0; i < sales; i++) {
            System.out.println("please enter value for sales person "+i);
          salespeople[i] = MilePerGarlon2.tryAndCatch();

          if (salespeople[i] > largest){
              largest = salespeople[i];
          }

        }
        System.out.println("the largest value sold is "+ largest);



    }

}
