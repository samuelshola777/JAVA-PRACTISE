package tdd;

public class MyTvTest {
    private static boolean powerMode;
    private static int volumeUp;

    public boolean PowerMode(){
        return powerMode;
    }
    public void turnOn() {
        if (!powerMode) {
            powerMode = true;
        }

    }

    public void turnOff() {
        if (powerMode) {
            powerMode = false;
        }

    }
    public int getVolumeUp() {

        return volumeUp;
    }
    public void increaseVolumeTest() {
        if (powerMode){
            volumeUp += 2;
        }
        if (volumeUp >= 10){
            volumeUp = 10;
        }


    }

    //    public static int setVolumeUp() {
//        if (powerMode == true){
//            volumeUp += 2 ;
//        } else if (volumeUp >= 10) {
//            volumeUp = 10;
//
//        }
//        return volumeUp ;
//    }

//
//    public static void increaseVolume() {
//        if (powerMode) {
//            if (volumeUp < 10) {
//                volumeUp += 2;
//            } else {
//                System.out.println("volume cannot exceed 10");
//            }
//        }
//    }
//
//    public static void decreaseVolume() {
//        if (powerMode) {
//            if (volumeUp > 0) {
//                volumeUp -= 1;
//            } else {
//                System.out.println("volume cannot go below 10");
//            }
//        }
//    }
}
