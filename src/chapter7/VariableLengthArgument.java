package chapter7;

import Chapter4.MilePerGarlon2;

public class VariableLengthArgument {

    public double average(double ... number){
        double total = 0.0;

        for (double smile : number){
            total += smile ;
        }

return total / number.length;
    }

    public static void main(String[] args) {

        VariableLengthArgument variable = new VariableLengthArgument();

        double d1 = 20;
        double d2 = 560;
        double d3 = 234;
        double d4 = 500;


        variable.average(d1, d2);
         variable.average(d1, d2, d3);
         variable.average(d1, d4, d3, d4);
         variable.average(d1, d1, d4, d3, d2);

         double variable1 =  variable.average(d1, d2);
         double variable2 =  variable.average(d1, d2, d3);
         double variable3 = variable.average(d1, d4, d3, d4);
         double variable4 =   variable.average(d1, d1, d4, d3, d2);

         double [] sam = { variable1, variable2 , variable3, variable4};
        double [] bone = new double[sam.length];

        for (int i = 0; i < sam.length; i++) {
            bone[i] = sam[i];
        }
        double max = bone[0];
        System.out.printf("");

        for (int i = 0; i < bone.length; i++) {
            System.out.printf("%.2f %n",bone[i]);
        }







         for ( double goat : bone ){
             System.out.printf("%.2f%n",goat);
         }
         for (double me : bone) {

             System.out.printf(" average is equals to  %.2f %s%n", me, (me < 100 ? "my name" +
                     " is samuel shola " : " bro it's not up to 100"));

         }

    }
}
