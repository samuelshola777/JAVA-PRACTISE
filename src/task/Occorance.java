package task;

public class Occorance {
    public static void main(String[] args) {

        String name = "Mississippisss";
        int countS = 0;
        int countI = 0;

        for (int i = 0; i < name.length(); i++) {
            if (String.valueOf(name.charAt(i)).equals("s")){
                countS++;
            }if (String.valueOf(name.charAt(i)).equals("i")){
                countI++;
            }
        }
        System.out.println(countS+"  <--()this is countS");
        System.out.println(countI+"  <--()this is countS");
    }
}
