package Python;

public class Assign_Value_Array {
    public static void main(String[] args) {

int [] boneshaker = new int[17];
        System.out.printf("%s%9s%n", "index", "value");
for (int bone = 0 ; bone < boneshaker.length; bone++){
    boneshaker[bone] =  + 2 + 2 * bone;

    System.out.printf("  %5d%5d%n",bone, boneshaker[bone]);

}




    }
}
