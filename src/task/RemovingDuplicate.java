package task;

public class RemovingDuplicate {
    public static void main(String[] args) {
        int[] nums = {9, 2, 2, 6, 6, 7, 7,};
        int just = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            just = nums[i];
            boolean exists = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) exists = true;
            }
            if (!exists) System.out.print( just+" ");
//  if (just != nums[i]){
//
//      System.out.print(just+" ");
//            }
        }
    }
}
