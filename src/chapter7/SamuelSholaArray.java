package chapter7;

public class SamuelSholaArray {
    public static void main(String[] args) {
        int [] bone = new int [15];

        //the act of representing sam as with length of index
        for (int sam = 0 ; sam < bone.length; sam ++ ){
            System.out.println(sam  );
            System.out.println("<------------>");
            // the value of array(bone) represendted by bone[sam]
            System.out.println(bone[sam]);

            int [] show = new int[90];

            for (int donz = 0 ; donz < show.length ; donz ++){

                System.out.println(show.length);

                System.out.println("<------------>");

                System.out.println(donz);
            }
        }
    }
}
