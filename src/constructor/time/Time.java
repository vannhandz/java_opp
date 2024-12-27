package constructor.time;

import java.time.LocalDateTime;

public class Time {
    private int hour;
    private int minute;
    private int second;


    public void setHour(int hour) {
        if(hour >=0 && hour <=23)
        {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute <= 59)
        {
            this.minute = minute;
        }
    }
    public void setSecond(int second) {
        if(second <=59)
        {
            this.second = second;
        }
    }
    public Time() {}

    public Time(int hour) {
        setHour(hour);
    }

    public Time(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }
    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }


    public Time coppyTime()
    {
        return new Time(hour, minute, second);
    }

    public void outPut()
    {
        System.out.println(hour + ":" + minute + ":" + second);
    }

}
