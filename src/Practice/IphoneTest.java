package Practice;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone iphoneTest = new Iphone("black",9000);

        Iphone.setPrice(16500);
        iphoneTest.setColor("red");
        System.out.println(iphoneTest.getColor());
        System.out.println(Iphone.getPrice());


    }
}