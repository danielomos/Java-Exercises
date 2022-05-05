package chapter_3;

public class Clock_Question314 {
    private int hour;
    private int minutes;
    private int seconds;

    public Clock_Question314(int hour, int minutes, int seconds ){
        if(hour <= 23) {
            this.hour = hour;
        }
        if(minutes <= 59) {
            this.minutes = minutes;
        }
        if (seconds <= 59) {
            this.seconds = seconds;
        }


    }

    public int getHour() {

        return hour;
    }

    public void setHour(int hour) {

        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public void displaytime(){

System.out.println("hh:"+hour+" mm:"+minutes+" ss:"+seconds);

    }

}
