package Practice;

public class Modulous_Class {

    private int minute;

    private int hour;

    private int day;


    public Modulous_Class (int day, int hour, int second){

        if ( day > 23) {
            day = 0;
        }
            this.day = day;
        if (hour > 59){
            hour = 0;
        }

            this.hour = hour;
        if (second > 59){
            second = 0;
        }
            this.minute = second;

    }

   public void setMinute(int minute){
       if (minute > 59 ){
           minute = 0;
       }
           this.minute = minute;
   }
   public void setHour(int hour){
       if (hour > 59){
            hour = 0;
       }
           this.hour = hour;

   }
   public void setDay(int day){
       if (day > 23){
          day = 0;
       }
           this.day = day;
   }
   public int getMinute(){return minute; }
   public int getDay(){
        return hour;
   }

   public int getHour(){
        return hour;
   }

}
