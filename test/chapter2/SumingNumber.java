package chapter2;

public class SumingNumber {

    public int getSmallNumber(int g, int g1, int g2){
        return Math.min(g,Math.min(g1, g2));

    }

    public int getlargeNumer(int B, int B1, int B2){
        return Math.max(B, Math.max(B1, B2));

    }

    public int getProduct(int z, int z1, int z2){
        return z * z1 * z2;
    }

    public static int getAverage(int i, int i1, int i2) {
        return ( i + i1 + i2) /3;
    }

    public int getSum(int i, int i1, int i2) {
        return i + i1 + i2;
    }


}
