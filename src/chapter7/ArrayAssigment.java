package chapter7;

public class ArrayAssigment {
    public static void main(String[] args) {

        int [][] t = new int[2][3];

        String [][] colors = {
                                {"red","blue","magenta"},
                                {"pink","orange","indigo"}
                                                            };

        System.out.println(colors[0][0]);
        System.out.println(colors[0][1]);
        System.out.println(colors[0][2]);
        System.out.println("<--------->");
        System.out.println(colors[1][0]);
        System.out.println(colors[1][1]);
        System.out.println(colors[1][2]);
    }
}
