package chapter3;

public class ModifyClockTest {
    public static void main(String[] args) {


        ModifyClock clock = new ModifyClock(9, 24, 03);
        System.out.printf("hour: %2d, minute: %d seconds: % d%n,",clock.getHour()
                ,clock.getMinute(),clock.getSeconds());
        System.out.println("<<----------------------------------->>");
ModifyClock.displayTime(10,30,20);

        System.out.println("this is clock ()->  "+clock);
    }

}