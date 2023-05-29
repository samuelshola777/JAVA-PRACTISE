package ClassWork;

public class AddingArray {
    public static void main(String[] args) {

        int [] array = {9, 8, 7 , 6, 5, 4, 2, 8};
        int add = 0;

        for (int counter = 0; counter < array.length; counter++ ){
            add = array[counter] + add;
        }
        System.out.println(add);
int max = 0;

for (int counter = 0 ; counter < array.length; counter++){
    if (array[counter] > max ){
        max = array[counter];
    }
}
        System.out.println(max);
int min = 0;

for (int counter = 1 ; counter < array.length; counter++){
    if (array[counter] <= counter){
        min = array[counter];
    }
    }
    System.out.println(min);

    }

}
