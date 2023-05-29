package Python;

public class EggSare {

    public static void creatOfegg(double egg, double numberOfCrates){

        System.out.println("The total number of eggs are 28\n"+ "While the number of crates are 7");
        double crates = egg/ numberOfCrates;
        double rem = egg % numberOfCrates;
        System.out.printf("There are %.1f that have been filled",crates);
        System.out.println();
        System.out.println("The number of eggs left after distributing them into the crates are "+ rem);
        double rem2 = 6 - rem;
        System.out.println("The remaining eggs that'll fill the last crate are:  "+ rem2);
    }
    public static void main(String[] args) {
       EggSare.creatOfegg(28,6);

    }
}
