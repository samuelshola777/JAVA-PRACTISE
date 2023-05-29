package Practice;

public class SortArray {
    public static void main(String[] args) {

        int[] numbers = {90,2, 12,45,56,90};
        int tem = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]){
            tem = numbers[i];
            numbers[i] = numbers[j];
            numbers[i] = numbers[j];
            numbers[j] = tem;}
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    }
}
