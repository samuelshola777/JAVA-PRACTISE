package chapter7;

public class ArrayInitializer {
    public static void main(String[] args) {


        System.out.println("<----------------------------------------------------------->");

   int [] boneshaker = {90, 40, 34, 22, 78, 7};

   for (int chi = 0; chi < boneshaker.length; chi++){
       System.out.println("index             value");
       System.out.println(chi +" "+boneshaker[chi]);
   }
        System.out.println("<----------------------------------------------------------->");

int [] face = {23, 67, 78, 98 ,89};

for (int bone = 0; bone < boneshaker.length; bone++){
    System.out.println(boneshaker[bone]+" "+ bone);
}

    }
}
