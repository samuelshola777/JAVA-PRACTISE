package Python;

public class My_Array {
    public static void main(String[] args) {
        int[] bone = {6, 34, 87 , 79, 00, 34, 89};
        System.out.printf("%s%9s"," index"," value");
        for (int counter = 0; counter < bone.length; counter ++ ){
            System.out.printf("  %n*  %d%9d  *",counter, bone[counter]);
        }

    }

}
