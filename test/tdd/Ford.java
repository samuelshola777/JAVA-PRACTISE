package tdd;

public class Ford {
    private boolean power;

 private int Acceleration;


   public boolean powerStatus(){
       return power;
   }
    public void turnOn() {
        if (power == false){
            power = true;
        }
    }
public void turnOff() {
    if (power == true) {
        power = false;
    }
}
public void powerOn(){
        if (power == false) power = true;
    
}
//        public void speed(){
//           return motion;
//    }


}
