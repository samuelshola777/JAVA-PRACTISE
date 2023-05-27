package codeWars;

public class FaceBookLikes {
public static String array(String[] namez){
    int z = namez.length-2;
     return namez[0]+","+namez[1]+" and "+z+" others likes this post";

}
    public static String whoLikeFaceBookPage(String [] name){

        System.out.println("""
                ********          ****             *           *\n
                *       *     *          * 
                
                
                
                
                
                """);


        int m2 = name.length-2;
        switch (name.length) {
            case 0 -> {
                return "no one likes this  post";
            }
            case 1 -> {
                return name[0] + " likes this post";
            }
            case 2 -> {
                return name[0] +","+name[1] + " likes this post";
            }
            case 3 -> {
                return name[0]+","+name[1]+" and "+name[2] + " likes this post";
            }
            case 4 -> {
                return name[0]+","+name[1]+" and "+m2+" others likes this post";
            }
            default -> array(name);

        }

return array(name);
    }

    public static void main(String[] args) {
        System.out.println(whoLikeFaceBookPage(new String[]{"samuel","bruce","bukola","blessing","temitope","boneshaker","ayomide"}));
    }

}
