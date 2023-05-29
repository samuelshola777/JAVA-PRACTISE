package task.chapter4;

public class FindTheHighestNumber {
    public static void main(String[] args) {
        int firstLArgest = 0;
        int secondLargest = 0;
        int[] arrayNumber = {1,200,3,4,5,6,7,80,9,10};
        int[] emptyArray =new int[arrayNumber.length];
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] > firstLArgest){
                firstLArgest = arrayNumber[i];
                emptyArray[i] = firstLArgest;

            }
        }
        System.out.println("firstLArgest: " + firstLArgest);
        for (int i = 0; i < arrayNumber.length; i++) {
            if (firstLArgest > arrayNumber[i] && arrayNumber[i] != firstLArgest){
                secondLargest = arrayNumber[i];
            }
        }

        System.out.println("second largest ()-> "+secondLargest);
        System.out.println();
        for (int i = 0; i < emptyArray.length; i++) {
            System.out.print(" "+emptyArray[i]);
        }
    }
}
