package chapter3;

import java.util.Timer;

public class ClockTest {
    public static void main(String[] args) {
boolean counter = true;
        Clock myClock = new Clock(6, 44, 20);


        System.out.println("hour: " + myClock.getHours() +
                " minute: " + myClock.getMinutes() + " seconds:" + myClock.getSeconds());

        System.out.println(myClock.getHours());

       // Timer timer = new Timer();
        //timer.scheduleAtFixedRate(, 0, 10);

//      while ( > 0){
//            counter++
//          myClock.setSeconds(); = myClock.setSeconds(myClock.getMinutes())1+;
//            System.out.println(myClock.getSeconds());
//     }

    }
}













