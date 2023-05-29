package chapter3;

public class Clock {
    public  Clock() {}
    private int hours;
    private  int minutes;
    private  int seconds;

//boolean counter = true;
  public Clock (int hours, int minutes, int seconds){
      if (hours <= 23){

          this.hours = hours;
      }
      if (minutes <= 59){

          this.minutes = minutes;
      }
      if (seconds <= 59){

          this.seconds = seconds;

      }
  }
  public void setHours(int food){
      if (food <= 24){

          this.hours = food;
      }
  }


  public void setMinutes(int minutes){
      if (minutes <= 59){

          this.minutes = minutes;
      }
  }
  public void setSeconds(int seconds) {
      if (seconds <= 59) {

          this.seconds = seconds;

      }
  }

  public int getHours(){
      return hours;
  }

  public int getMinutes(){
      return minutes;
  }
  public int getSeconds(){


      return seconds;
  }


}
